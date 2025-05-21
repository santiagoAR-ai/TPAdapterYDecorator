package Ejercicio1;

public class MotorElectricoAdapter implements Motor{
    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando motor eléctrico...");
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor eléctrico...");
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor eléctrico...");
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
