/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Graphics;

/**
 *
 * @author 48303706888
 */
public class Circulo extends D2{
    public int raio;
    public int X2;
    public int Y2;
    
    Circulo(){
        this.X2 =0;
        this.Y2 = 0;
        this.raio = 0;
    }
    @Override
    public float area() {
      return (raio^2)*3.14f;
    }

    @Override
    public double perimetro() {
       return 2*(Math.PI)*raio;
    }
    @Override
    public void desenhar(Graphics g){
        super.desenhar(g);
        g.setColor(super.cor);
        g.drawOval(super.x, super.y, raio*2, raio*2);
        g.setColor(super.corInterna);
        g.fillOval(super.x, super.y, raio*2, raio*2);
    }

}
