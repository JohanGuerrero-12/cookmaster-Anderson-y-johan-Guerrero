package recetas;

public class Paso {
    private final int numero;
    private final String descripcion;

    public Paso(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public int getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return numero + ". " + descripcion;
    }
}
