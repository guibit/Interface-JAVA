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
public class RetanguloMovel implements Movel {
   
    private int[] superiorEsquerda = new int[2];
    private int[] inferiorDireita = new int[2];
    private int velX , velY;
    
    
    public RetanguloMovel(int x1, int y1,int x2, int y2, int velX, int velY){
        superiorEsquerda[0]=x1;
        superiorEsquerda[1]=y1;
        inferiorDireita[0]=x2;
        inferiorDireita[1]=y2;
        this.velX = velX;
        this.velY = velY;
    }
    
    @Override
    public String toString(){
        return "RetanguloMovel[Superior Esquerdo x="+superiorEsquerda[0]+
                ", Superior Esquerdo y="+superiorEsquerda[1]+
                "Infeior Direito x="+inferiorDireita[0]+", Infeior Direito y="+
                inferiorDireita[1]+", velX="+velX+", velY="+velY+"] " ;
    }
    

    @Override
    public void moverParaCima() {
        superiorEsquerda[1]=superiorEsquerda[1]+1;
        inferiorDireita[1]=inferiorDireita[1]+1;
    }

    @Override
    public void moverParaBaixo() {
        superiorEsquerda[1]=superiorEsquerda[1]-1;
        inferiorDireita[1]=inferiorDireita[1]-1;
    }

    @Override
    public void moverParaEsquerda() {
        superiorEsquerda[0]=superiorEsquerda[0]-1;
        inferiorDireita[0]=inferiorDireita[0]-1;
    }

    @Override
    public void moverParaDireita() {
        superiorEsquerda[0]=superiorEsquerda[0]+1;
        inferiorDireita[0]=inferiorDireita[0]+1;
    }
    
    
}
    
