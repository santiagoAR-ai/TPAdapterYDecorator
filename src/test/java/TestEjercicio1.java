import Ejercicio5.modelo.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TestEjercicio1 {

    @Test
    public void test01() {
        Participante participante = new Participante("Juan", "Pérez",
                0, "santiagoabdala270@gmail.com");

        var enMemoria = new FakeRegistroDeInscripcion();
        var serviceFake = new ServiceMailFake();

        IConcurso concursoBase = new Concurso(LocalDate.now(),
                LocalDate.now().plusDays(7),
                LocalDate.now(), 2);
        IConcurso concursoConRegistro = new ConcursoDecoradorConRegistro(concursoBase, enMemoria);
        IConcurso concursoFinal = new ConcursoDecorador(concursoConRegistro, serviceFake);

        concursoFinal.inscribirParticipante(participante);

        assertTrue(concursoFinal.estaIncripto(participante));
        assertEquals(10, participante.getPuntos());
        assertEquals("santiagoabdala270@gmail.com - Inscripción: Usted ha realizado la inscripción...",
                serviceFake.mail());
    }

    @Test
    public void test02() {
        Participante participante1 = new Participante("Sofia", "Perez", 1, "santiagoabdala270@gmail.com");
        Participante participante2 = new Participante("Lautaro", "Pérez", 2, "santiagoabdala270@gmail.com");

        var enMemoria = new FakeRegistroDeInscripcion();
        var serviceFake = new ServiceMailFake();

        IConcurso concursoBase = new Concurso(LocalDate.now(),
                LocalDate.now().plusDays(5),
                LocalDate.now().plusDays(1), 2);
        IConcurso concursoConRegistro = new ConcursoDecoradorConRegistro(concursoBase, enMemoria);
        IConcurso concursoFinal = new ConcursoDecorador(concursoConRegistro, serviceFake);

        concursoFinal.inscribirParticipante(participante1);
        concursoFinal.inscribirParticipante(participante2);

        assertEquals(2, concursoFinal.cantParticipante());
        assertTrue(concursoFinal.estaIncripto(participante1));
        assertTrue(concursoFinal.estaIncripto(participante2));
        assertEquals("santiagoabdala270@gmail.com - Inscripción: Usted ha realizado la inscripción...",
                serviceFake.mail());
    }

    @Test
    public void test03() {
        Participante participante = new Participante("Carlos", "Gomez", 3, "santiagoabdala270@gmail.com");

        var enMemoria = new FakeRegistroDeInscripcion();
        var serviceFake = new ServiceMailFake();

        IConcurso concursoBase = new Concurso(LocalDate.now(),
                LocalDate.now().plusDays(5),
                LocalDate.now().plusDays(8), 2);
        IConcurso concursoConRegistro = new ConcursoDecoradorConRegistro(concursoBase, enMemoria);
        IConcurso concursoFinal = new ConcursoDecorador(concursoConRegistro, serviceFake);

        assertThrows(RuntimeException.class, () -> {
            concursoFinal.inscribirParticipante(participante);
        });

        assertFalse(concursoFinal.estaIncripto(participante));
    }
}


