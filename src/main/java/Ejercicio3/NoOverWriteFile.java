package Ejercicio3;

import java.io.File;

public class NoOverWriteFile implements IReport{
    private IReport report;

    public NoOverWriteFile(IReport report) {
        this.report = report;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        report.export(file);
    }
}
