package src.main.java.com.mycompany.paint;
import java.awt.Graphics;

/*
 * @author guilherme_rodrigues
 */

public class Cilindro extends D3 {
    public int raio;
    public int X2;
    public int Y2;
    
    Cilindro(){}
    
    public float areaCirculo(){
        return 3.14f * raio * raio;
    }
    
    public float perimetroCirculo(){
        return 2 * 3.14f * raio;
    }
    
    @Override
    public float area(){
        // Duas Areas de circulo mais uma area de um retangulo (perimetro do circulo * altura)
        return 2 * areaCirculo() + perimetroCirculo() * altura;
    }
    
    @Override
    public float volume(){
        return altura * 2 * 3.14f * raio;
    }
    
    @Override
    public void desenhar(Graphics g){
        altura = Y2 - super.y;
        int base = X2 - super.x;
        super.desenhar(g);    
        
        //desenho do retangulo
        g.setColor(super.corInterna);
        g.fillRect(super.x, super.y, base, altura);
        g.setColor(cor);
        g.drawRect(super.x, super.y, base, altura);  
        
        //desenho do topo
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y - (altura)/10, raio*2, 2 * (altura)/10);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y - (altura)/10, raio*2, 2 * (altura)/10);
        
        
        //desenho da base
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y + altura - altura/10, raio*2, 2 * (altura)/10);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y + altura - altura/10, raio*2, 2 * (altura)/10);
        
    }    
}
