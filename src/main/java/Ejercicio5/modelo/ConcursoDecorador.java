package Ejercicio5.modelo;

import java.time.LocalDate;

public class ConcursoDecorador implements IConcurso{
    private IConcurso concurso;
    private IMailService mailService;

    public ConcursoDecorador(IConcurso concurso, IMailService mailService) {
        this.concurso = concurso;
        this.mailService = mailService;

    }

    @Override
    public void inscribirParticipante(Participante participante) {
        concurso.inscribirParticipante(participante);
        mailService.enviarCorreo(participante.getEmail(),"Inscripción",
                "Usted ha realizado la inscripción...");

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
