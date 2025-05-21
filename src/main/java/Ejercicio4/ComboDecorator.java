package Ejercicio4;

public class ComboDecorator implements Combo{
    private  Combo combo;
    private  Porcion porcion;

    public ComboDecorator(Combo combo, Porcion porcion) {
        this.combo = combo;
        this.porcion = porcion;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + ", " + porcion.nombre();
    }

    @Override
    public double precio() {
        return combo.precio() + porcion.costo();
    }
}
