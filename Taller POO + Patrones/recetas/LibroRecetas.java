package recetas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LibroRecetas {
    private static LibroRecetas instancia;
    private final List<Receta> recetas = new ArrayList<>();

    private LibroRecetas() {
    }

    public static synchronized LibroRecetas getInstancia() {
        if (instancia == null) instancia = new LibroRecetas();
        return instancia;
    }

    public void agregarReceta(Receta r) {
        recetas.add(r);
    }

    public List<Receta> obtenerTodas() {
        return Collections.unmodifiableList(recetas);
    }

    public List<Receta> buscarPorNombre(String nombre) {
        String busc = nombre.toLowerCase();
        return recetas.stream()
                .filter(r -> r.getNombre().toLowerCase().contains(busc))
                .collect(Collectors.toList());
    }
}
