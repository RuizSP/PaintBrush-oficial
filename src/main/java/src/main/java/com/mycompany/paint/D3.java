package src.main.java.com.mycompany.paint;

/**
 *
 * @author guilhermerodrigues
 */

import java.awt.Color;
import java.awt.Graphics;

abstract public class D3 extends Ponto {
    public Color corInterna;
    public boolean showVolume = false;
    public int altura;
    
abstract public float volume();

@Override
    public void desenhar(Graphics g) {
        if (showVolume) {
            g.setColor(cor);
            g.drawString(Float.toString(volume()), x - 10, y - 10);
       }      
    }
}
