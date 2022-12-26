/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author ruiz
 */
public class Borracha extends Spray{
    @Override
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
