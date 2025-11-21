package recetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Receta {
    private final String nombre;
    private final int tiempoPreparacion; // en minutos
    private final List<Ingrediente> ingredientes = new ArrayList<>();
    private final List<Paso> pasos = new ArrayList<>();
    private final TipoReceta tipo;

    protected Receta(String nombre, int tiempoPreparacion, TipoReceta tipo) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempoPreparacion;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public TipoReceta getTipo() {
        return tipo;
    }

    public void agregarIngrediente(Ingrediente ing) {
        ingredientes.add(ing);
    }

    public void agregarPaso(Paso paso) {
        pasos.add(paso);
    }

    public List<Ingrediente> getIngredientes() {
        return Collections.unmodifiableList(ingredientes);
    }

    public List<Paso> getPasos() {
        return Collections.unmodifiableList(pasos);
    }

    protected abstract String detalleTipo();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receta: ").append(nombre).append(" (").append(tipo).append(")\n");
        sb.append("Tiempo: ").append(tiempoPreparacion).append(" min\n");
        sb.append(detalleTipo()).append("\n");
        sb.append("Ingredientes:\n");
        for (Ingrediente i : ingredientes) sb.append(" - ").append(i).append("\n");
        sb.append("Pasos:\n");
        for (Paso p : pasos) sb.append(" ").append(p).append("\n");
        return sb.toString();
    }
}
