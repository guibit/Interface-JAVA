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
public class PontoMovel implements Movel{
    private int x,y;
    private int velX , velY;
    
    
    public PontoMovel(int x, int y,int velX, int velY){
        this.x=x;
        this.y=y;
        this.velX = velX;
        this.velY = velY;
    }
    
    @Override
    public String toString(){return "PontoMovel[x="+x+", y="+y+", velX="+velX+", velY="+velY+"] " ;}
    

    @Override
    public void moverParaCima() {x=x+1;
    }

    @Override
    public void moverParaBaixo() {x=x-1;
    }

    @Override
    public void moverParaEsquerda() {y=y-1;
    }

    @Override
    public void moverParaDireita() {y=y+1;
    }
    
}
