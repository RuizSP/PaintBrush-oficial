/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
public class Retangulo extends D2 {
        public int base, largura;
        
        @Override 
        public void desenhar(Graphics g) {
              super.desenhar(g);
              g.setColor(corInterna);
              g.fillRect(x, y, base, largura);
              g.setColor(cor);
              g.drawRect(x, y, base, largura);              
        }
        
        @Override
        public float area() {
            return base * largura;
        }
         
        @Override
        public double perimetro() {
            return 2*(base + largura);
        }
        
    
}
