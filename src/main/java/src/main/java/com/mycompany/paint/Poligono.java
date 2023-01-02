
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package src.main.java.com.mycompany.paint;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author 48303706888
 */

public class Poligono extends Ponto{
    Ponto p;
    public int[] pontosX;
    public int[] pontosY;
    Color corInterna;
    ArrayList<Ponto> listaPontos;
    
    Poligono(){
       listaPontos = new ArrayList();  
    }
    
    public void adicionarPontos(int x, int y){
        p = new Ponto(x,y);
        listaPontos.add(p);
    }

    @Override
    public void desenhar(Graphics g){
        pontosX = new int[listaPontos.size()];
        pontosY = new int[listaPontos.size()];
        for(int i =0; i<listaPontos.size(); i++){
            pontosX[i] = listaPontos.get(i).x;
            pontosY[i] = listaPontos.get(i).y;
        }
        for(int i =0;i<listaPontos.size();i++){
            g.setColor(cor);
            g.drawPolygon(pontosX, pontosY,listaPontos.size());
            g.setColor(corInterna);
            g.fillPolygon(pontosX, pontosY,listaPontos.size());
            
            
        }
        limparPontos();
    }
    
    public void limparPontos() {
       listaPontos.removeAll(listaPontos);
       listaPontos.clear();
    }
    
}