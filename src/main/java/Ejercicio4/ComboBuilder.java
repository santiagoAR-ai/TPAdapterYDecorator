package Ejercicio4;

public class ComboBuilder {
    private Combo combo;

    public ComboBuilder(Combo comboInicial) {
        this.combo = comboInicial;
    }
    public ComboBuilder ComboEspecial(Porcion porcion) {
        this.combo = new ComboDecorator(this.combo, porcion);
        return this;
    }
    public ComboBuilder ComboBásico(Porcion porcion) {
        this.combo = new ComboDecorator(this.combo, porcion);
        return this;
    }
    public ComboBuilder ComboFamiliar(Porcion porcion) {
        this.combo = new ComboDecorator(this.combo, porcion);
        return this;
    }

    public Combo build() {
        return this.combo;
    }
}
