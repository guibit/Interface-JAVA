/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.interfaces.folder;

/**
 *
 * @author guilh
 */
public class CirculoMovel implements Movel{
    private int raio;
    private int[] centro = new int[2];
    private int velX , velY;
    
    
    public CirculoMovel(int raio, int x, int y,int velX, int velY){
        centro[0]=x;
        centro[1]=y;
        this.velX = velX;
        this.velY = velY;
        this.raio = raio;
    }
    
    @Override
    public String toString(){return "CirculoMovel[raio="+raio+", PontoMovel[x="+centro[0]+", y="+centro[1]+", velX="+velX+", velY="+velY+"] " ;}
    

    @Override
    public void moverParaCima() {centro[1]=centro[1]+1;
    }

    @Override
    public void moverParaBaixo() {centro[1]=centro[1]-1;
    }

    @Override
    public void moverParaEsquerda() {centro[0]=centro[0]-1;
    }

    @Override
    public void moverParaDireita() {centro[0]=centro[0]+1;
    }
    
    
}
