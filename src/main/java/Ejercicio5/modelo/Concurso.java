package Ejercicio5.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Concurso implements IConcurso{
    private LocalDate fechaInicio;
    private LocalDate fechaCierre;
    private List<Participante> lista;
    private LocalDate fechaActual;
    private int id;

    public Concurso(LocalDate fechaInicio, LocalDate fechaCierre,
                    LocalDate fechaActual, int id) {
        if (fechaInicio.isAfter(fechaCierre)) {
            throw new RuntimeException("La fecha de inicio no tiene que ser después de la de cierre");
        }
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.lista = new ArrayList<>();
        this.fechaActual = fechaActual;
        this.id = id;
    }
    @Override
    public void inscribirParticipante(Participante participante) {
        if (fechaActual.isAfter(fechaCierre)) {
            throw new RuntimeException("Ha pasada el periodo de incripscion");
        }
        if (fechaActual.isEqual(fechaInicio)) {
            participante.sumarPuntos(10);
        }
        lista.add(participante);
    }
    @Override
    public boolean estaIncripto(Participante participante) {
        return lista.contains(participante);
    }

    @Override
    public int cantParticipante() {
        return lista.size();
    }
    @Override
    public int getId() {
        return this.id;
    }
    @Override
    public LocalDate fechaActual(){
        return this.fechaActual;
    }

}