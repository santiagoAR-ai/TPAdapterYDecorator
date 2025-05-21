package Ejercicio4;

public enum Porcion {
    TOMATE(0.5,"Tomate"),
    QUESO(0.7, "Queso"),
    PAPAS(1.5, "Papas"),
    CARNE(2.5, "Carne");
    private final double costo;
    private final String nombre;

    Porcion(double costo, String nombre) {
        this.costo = costo;
        this.nombre = nombre;
    }
    public double costo(){
        return this.costo;
    }
    public String nombre(){
        return this.nombre;
    }
}
