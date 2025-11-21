package recetas;

public class Bebida extends Receta {
    private final boolean alcoholica;

    public Bebida(String nombre, int tiempoPreparacion, boolean alcoholica) {
        super(nombre, tiempoPreparacion, TipoReceta.BEBIDA);
        this.alcoholica = alcoholica;
    }

    public boolean isAlcoholica() {
        return alcoholica;
    }

    @Override
    protected String detalleTipo() {
        return "Alcohol: " + (alcoholica ? "Sí" : "No");
    }
}
