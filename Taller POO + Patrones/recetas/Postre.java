package recetas;

public class Postre extends Receta {
    private final int nivelDulce; // 1-10

    public Postre(String nombre, int tiempoPreparacion, int nivelDulce) {
        super(nombre, tiempoPreparacion, TipoReceta.POSTRE);
        this.nivelDulce = nivelDulce;
    }

    public int getNivelDulce() {
        return nivelDulce;
    }

    @Override
    protected String detalleTipo() {
        return "Nivel de dulzura: " + nivelDulce;
    }
}
