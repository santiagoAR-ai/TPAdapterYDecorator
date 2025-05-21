package Ejercicio4;

public class ComboInicial implements Combo{
    private double precio;
    private String descripcion;

    public ComboInicial(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String descripcion() {
        return this.descripcion;
    }

    @Override
    public double precio() {
        return this.precio;
    }

}
