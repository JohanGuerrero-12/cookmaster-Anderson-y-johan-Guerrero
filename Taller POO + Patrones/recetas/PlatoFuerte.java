package recetas;

public class PlatoFuerte extends Receta {
    private final int calorias;

    public PlatoFuerte(String nombre, int tiempoPreparacion, int calorias) {
        super(nombre, tiempoPreparacion, TipoReceta.PLATOFUERTE);
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    protected String detalleTipo() {
        return "Calorías (aprox): " + calorias;
    }
}
