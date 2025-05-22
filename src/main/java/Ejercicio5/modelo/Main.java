package Ejercicio5.modelo;


import Ejercicio5.persistence.EnDiscoRegistroDeInscripcion;
import Ejercicio5.persistence.RegistroDeInscripcionesDAOJDBC;
import Ejercicio5.persistence.ServiceMail;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Participante participante = new Participante("Juan", "Pérez",
                0, "santiagoabdala270@gmail.com");

        IMailService mail = new ServiceMail(
                "05b1cdffe5297b", "2e74a25c291adf",
                "true", "true",
                "sandbox.smtp.mailtrap.io", "587"
        );

        RegistroDeInscripcion registro = new EnDiscoRegistroDeInscripcion(
                "C:\\Users\\santi\\OneDrive\\Documentos\\TP2Ejercicio1\\archivo.txt"
        );

        // Paso 1: Crear concurso base (sin responsabilidades adicionales)
        IConcurso concursoBase = new Concurso(
                LocalDate.now(),
                LocalDate.now().plusDays(7),
                LocalDate.now(),
                2
        );

        // Paso 2: Aplicar decoradores
        IConcurso concursoConRegistro = new ConcursoDecoradorConRegistro(concursoBase, registro);
        IConcurso concursoFinal = new ConcursoDecorador(concursoConRegistro, mail);

        // Paso 3: Inscripción usando concurso decorado
        concursoFinal.inscribirParticipante(participante);
    }
}