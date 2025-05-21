package Ejercicio1;

public class MotorComun implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Arranco el motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor comun");
    }
}
