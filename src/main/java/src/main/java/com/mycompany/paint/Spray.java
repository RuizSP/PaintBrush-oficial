/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author 48303706888
 */
public class Spray {
    public Color cor;
    public int min_valX;
    public int max_valX;
    public int min_valY;
    public int max_valY;
    public Ponto p;
    
    Graphics G;
    Spray(){
           min_valX = 0 ;
           max_valX = 0;
           min_valY = 0;
           max_valY = 0;
           p = new Ponto();
    }
    

    public void desenhar(){
            p.cor = cor;
            ThreadLocalRandom tlr = ThreadLocalRandom.current();
            int randomNumX;
            int randomNumY;
            for(int i =0 ; i<10; i++){
                randomNumX= tlr.nextInt(min_valX, max_valX + 1);
                randomNumY= tlr.nextInt(min_valY, max_valY + 1);
                p.x = randomNumX;
                p.y = randomNumY;
                p.desenhar(G); 
                
    }
    
    
    }
}
