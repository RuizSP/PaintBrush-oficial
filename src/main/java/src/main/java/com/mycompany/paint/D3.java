package src.main.java.com.mycompany.paint;

/**
 *
 * @author guilhermerodrigues
 */

import java.awt.Color;
import java.awt.Graphics;

abstract public class D3 extends Ponto {
    public Color corInterna;
    public boolean showArea = false;
    public boolean showVolume = false;
    public int altura;
    
abstract public float area();
abstract public float volume();

@Override
    public void desenhar(Graphics g) {
        if (showArea) {
            g.setColor(cor);
            g.drawString("Área: " + Float.toString(area()), x-20, y-20);
       }
        if (showVolume) {
            g.setColor(cor);
            g.drawString("Volume: " + Float.toString(volume()), x - 10, y - 10);
       }      
    }
}
