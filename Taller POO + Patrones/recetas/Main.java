package recetas;

public class Main {
    public static void main(String[] args) {
        LibroRecetas libro = LibroRecetas.getInstancia();

        // Crear un postre
        Postre flan = RecetaFactory.crearPostre("Flan casero", 60, 7);
        flan.agregarIngrediente(new Ingrediente("Leche", 500, "ml"));
        flan.agregarIngrediente(new Ingrediente("Huevos", 4, "unidades"));
        flan.agregarIngrediente(new Ingrediente("Azúcar", 120, "g"));
        flan.agregarPaso(new Paso(1, "Batir huevos con azúcar"));
        flan.agregarPaso(new Paso(2, "Agregar leche y mezclar"));
        flan.agregarPaso(new Paso(3, "Hornear al baño María"));

        // Crear un plato fuerte
        PlatoFuerte arroz = RecetaFactory.crearPlatoFuerte("Arroz con pollo", 45, 650);
        arroz.agregarIngrediente(new Ingrediente("Arroz", 300, "g"));
        arroz.agregarIngrediente(new Ingrediente("Pollo", 500, "g"));
        arroz.agregarPaso(new Paso(1, "Sofreír pollo"));
        arroz.agregarPaso(new Paso(2, "Agregar arroz y agua"));

        // Crear una bebida
        Bebida limonada = RecetaFactory.crearBebida("Limonada", 10, false);
        limonada.agregarIngrediente(new Ingrediente("Limones", 4, "unidades"));
        limonada.agregarIngrediente(new Ingrediente("Agua", 1, "L"));
        limonada.agregarIngrediente(new Ingrediente("Azúcar", 50, "g"));
        limonada.agregarPaso(new Paso(1, "Exprimir los limones"));
        limonada.agregarPaso(new Paso(2, "Mezclar con agua y azúcar"));

        // Agregar al libro
        libro.agregarReceta(flan);
        libro.agregarReceta(arroz);
        libro.agregarReceta(limonada);

        // Mostrar todas
        System.out.println("--- Todas las recetas ---");
        for (Receta r : libro.obtenerTodas()) {
            System.out.println(r);
        }

        // Buscar por nombre
        System.out.println("--- Buscar 'arroz' ---");
        for (Receta r : libro.buscarPorNombre("arroz")) {
            System.out.println(r.getNombre() + " -> Tipo: " + r.getTipo());
        }
    }
}
