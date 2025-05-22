package Ejercicio5.modelo;

import java.time.LocalDate;

public interface IConcurso {
    void inscribirParticipante(Participante participante);
    boolean estaIncripto(Participante participante);
    int cantParticipante();
    int getId();
    LocalDate fechaActual();
}
