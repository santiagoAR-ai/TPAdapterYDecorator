package Ejercicio3;

import java.io.File;

public class OverWriteFile implements IReport{
    private IReport report;

    public OverWriteFile(IReport report) {
        this.report = report;
    }
    @Override
    public void export(File file) {
        report.export(file);
    }
}
