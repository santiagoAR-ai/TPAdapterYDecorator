package Ejercicio1;

public class MotorEconomico implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Arranco el motor economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando Motor Economico");
    }
}
