package Ejercicio4;

public class MainCombo {
    public static void main(String[] args) {
        Combo comboFamiliar = new ComboBuilder(new ComboInicial(400, "Combo Familiar"))
                .ComboFamiliar(Porcion.CARNE)
                .ComboFamiliar(Porcion.CARNE)
                .ComboFamiliar(Porcion.PAPAS)
                .build();

        System.out.println("Descripción Combo Familiar:");
        System.out.println(comboFamiliar.descripcion());
        System.out.println("Precio total: " + comboFamiliar.precio());

        System.out.println();

        Combo comboBasico = new ComboBuilder(new ComboInicial(300, "Combo Básico"))
                .ComboBásico(Porcion.TOMATE)
                .ComboBásico(Porcion.QUESO)
                .build();

        System.out.println("Descripción combo básico:");
        System.out.println(comboBasico.descripcion());
        System.out.println("Precio total: " + comboBasico.precio());
    }
}
