/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Graphics;

/**
 *
 * @author ruiz
 */
public class Borracha extends Ponto{
    
    @Override 
        public void desenhar(Graphics g) {
              g.setColor(cor);
              g.drawRect(x - 30, y - 30, 60, 60);
              g.fillRect(x - 30, y - 30, 60, 60);
        }
}        