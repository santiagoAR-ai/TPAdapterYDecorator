package Ejercicio1;

public class MainMotor {
    public static void main(String[]args){
        var motor= new MotorEconomico();
        var motor2= new MotorComun();
        var motor3= new MotorElectricoAdapter(new MotorElectrico());
        motor.arrancar();
        motor.acelerar();
        motor.apagar();
        motor2.arrancar();
        motor2.acelerar();
        motor2.apagar();
        motor3.arrancar();
        motor3.acelerar();
        motor3.apagar();

    }
}
