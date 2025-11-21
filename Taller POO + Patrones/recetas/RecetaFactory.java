package recetas;

public class RecetaFactory {
    public static Postre crearPostre(String nombre, int tiempo, int nivelDulce) {
        return new Postre(nombre, tiempo, nivelDulce);
    }

    public static PlatoFuerte crearPlatoFuerte(String nombre, int tiempo, int calorias) {
        return new PlatoFuerte(nombre, tiempo, calorias);
    }

    public static Bebida crearBebida(String nombre, int tiempo, boolean alcoholica) {
        return new Bebida(nombre, tiempo, alcoholica);
    }

    // Opcional: crear según TipoReceta
    public static Receta crearPorTipo(TipoReceta tipo, String nombre, int tiempo, Object extra) {
        switch (tipo) {
            case POSTRE -> {
                return crearPostre(nombre, tiempo, (Integer) extra);
            }
            case PLATOFUERTE -> {
                return crearPlatoFuerte(nombre, tiempo, (Integer) extra);
            }
            case BEBIDA -> {
                return crearBebida(nombre, tiempo, (Boolean) extra);
            }
            default -> throw new IllegalArgumentException("Tipo desconocido: " + tipo);
        }
    }
}
