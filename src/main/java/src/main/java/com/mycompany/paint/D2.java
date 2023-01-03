/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import src.main.java.com.mycompany.paint.Ponto;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
abstract public class D2 extends Ponto {

    public D2() {
        super();
    }
    public Color corInterna;
    public boolean showArea = false;
    public boolean showPerimetro = false;
    abstract public float area();
    abstract public double perimetro();
    @Override
    public void desenhar(Graphics g) {
        if (showArea) {
            g.setColor(cor);
            g.drawString("Área: " + Float.toString(area()), x-10, y-10);
       }
        if(showPerimetro){
            g.setColor(cor);
            g.drawString("Perímetro: " + Double.toString(perimetro()), x-20, y-20);
        }
    }
    
}
