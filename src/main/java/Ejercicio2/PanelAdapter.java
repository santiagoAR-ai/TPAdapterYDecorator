package Ejercicio2;

import java.awt.*;

public class PanelAdapter implements Panel{
    private Graphics2D g;
    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        g.drawOval(x - radio,
                y - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void dibujarLinea(int coordenadaX, int coordenadaY, int coordenadaX2, int coordenadaY2) {
        g.drawLine(coordenadaX, coordenadaY, coordenadaX2, coordenadaY2);
    }

    @Override
    public void escribirTexto(String texto, int x, int y) {
        g.drawString(texto, x, y);
    }
}
