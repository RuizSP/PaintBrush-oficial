/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;

import java.awt.Graphics;
import static java.lang.Math.sqrt;


/**
 *
 * @author 48303706888
 */
public class D1 extends Ponto {
   public int X1;
   public int Y1;
   public boolean showComprimento;
    
    D1(){
       super();
        this.X1 =0;
        this.Y1 = 0;
        this.showComprimento = false;
    }
    @Override
    public void desenhar(Graphics g){
        g.setColor(super.cor);
        g.drawLine(super.x, super.y, X1, Y1);
        if(this.showComprimento)
            g.drawString(Double.toString(comprimento()), x, y);
    }
    public double comprimento(){
        int a = (this.X1 - super.x)^2;
        int b = (this.Y1 - super.y)^2;   
        return sqrt(a + b);
    }
}
