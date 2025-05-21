package Ejercicio4;

public class ComboBuilder {
    private Combo combo;

    public ComboBuilder(ComboInicial comboInicial) {
        this.combo = comboInicial;
    }
    public void agregarPorcion(ComboInicial comboInicial,Porcion porcion) {
        this.combo = new ComboDecorator(comboInicial, porcion);
    }

    public String combo() {
        return combo.descripcion();
    }
}
