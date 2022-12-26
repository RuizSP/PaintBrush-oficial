/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author sergio.lima
 */
public class Ponto {
    public int x,y;
    public Color cor;
    Ponto(){
    }
    Ponto(int x, int y){
        this.x = x;
        this.y = y; 
    }
    
    public void desenhar(Graphics g) {
        g.setColor(cor);
        g.drawLine(x, y, x, y);
    }
            
    
}
