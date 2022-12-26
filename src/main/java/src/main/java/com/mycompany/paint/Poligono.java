/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.com.mycompany.paint;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;
/**
 *
 * @author 48303706888
 */
public class Poligono extends Ponto{

    public Poligono() {
        super();
    }
    ArrayList<Ponto> pontos = new ArrayList<>();
    public Color corInterna;
    
    @Override
    public void desenhar(Graphics g){
        pontos.add(new Ponto(x, y));
        g.setColor(cor);
    }

    public void pegarPontos(Graphics g){
        int xPoints[] = new int[pontos.size()];
        int yPoints[] = new int[pontos.size()];
        
        for(int i = 0; i < pontos.size(); i++){
            xPoints[i] = pontos.get(i).x;
            yPoints[i] = pontos.get(i).y;
        }
        
        for(int i = 1; i < pontos.size(); i++){
            g.setColor(cor);
            g.drawPolygon(xPoints, yPoints, pontos.size());
            g.setColor(corInterna);
            g.fillPolygon(xPoints, yPoints, pontos.size());
        }    
    }
    
    public void limparPontos() {
        pontos.removeAll(pontos);
        pontos.clear();
    }
}