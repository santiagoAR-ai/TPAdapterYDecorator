package Ejercicio5.modelo;

import java.time.LocalDate;

public class ConcursoDecoradorConRegistro implements IConcurso{
    private IConcurso concurso;
    private RegistroDeInscripcion registroDeInscripcion;

    public ConcursoDecoradorConRegistro(IConcurso concurso, RegistroDeInscripcion registroDeInscripcion) {
        this.concurso = concurso;
        this.registroDeInscripcion = registroDeInscripcion;
    }

    @Override
    public void inscribirParticipante(Participante participante) {
        concurso.inscribirParticipante(participante);
        this.registroDeInscripcion.registrar(concurso.fechaActual(), participante.getId(), concurso.getId());
    }

    @Override
    public boolean estaIncripto(Participante participante) {
        return concurso.estaIncripto(participante);
    }

    @Override
    public int cantParticipante() {
        return concurso.cantParticipante();
    }

    @Override
    public int getId() {
        return concurso.getId();
    }

    @Override
    public LocalDate fechaActual() {
        return concurso.fechaActual();
    }
}

