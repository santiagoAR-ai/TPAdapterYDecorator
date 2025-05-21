package Ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements IReport{
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
            System.out.println("Reporte exportado a " + file.getAbsolutePath());
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir el archivo", e);
        }
    }
}

