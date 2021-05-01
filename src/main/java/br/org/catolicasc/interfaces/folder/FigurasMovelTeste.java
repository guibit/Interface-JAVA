/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.catolicasc.interfaces.folder;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class FigurasMovelTeste {
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        char escolha;
        //CirculoMovel c1 = new CirculoMovel() ;
        
        System.out.println("Que figura você deseja mover [c/r]? ");
        escolha = (char)System.in.read();
        
        if((escolha == 'r') || (escolha=='R')){
            
            int pontosupesquerddo, pontosupesquerdo2, pontoinfdireito, pontoinfdireito2  ,velx,vely;
            System.out.println("Insira os valores de ponto superior esquerdo x, y , ponto inferior direito x,y e velocidade X e velocidade Y: ");
            pontosupesquerddo = entrada.nextInt();
            pontosupesquerdo2 = entrada.nextInt();
            pontoinfdireito = entrada.nextInt();
            pontoinfdireito2 = entrada.nextInt();
            velx = entrada.nextInt();
            vely = entrada.nextInt();
            RetanguloMovel R1 = new RetanguloMovel(pontosupesquerddo,pontosupesquerdo2,pontoinfdireito, pontoinfdireito2,velx,vely);
            System.out.println("Retangulo Criado");
            System.out.println(R1.toString());
            System.out.println("Movendo para cima");
            R1.moverParaCima();
            System.out.println(R1.toString());
            System.out.println("Movendo para direita");
            R1.moverParaDireita();
            System.out.println(R1.toString());
            System.out.println("Movendo para baixo");
            R1.moverParaBaixo();
            System.out.println(R1.toString());
            System.out.println("Movendo para equerda");
            R1.moverParaEsquerda();
            System.out.println(R1.toString());
            
            
        }
        
        if((escolha == 'c') || (escolha == 'C')){
        int raio,raiox,raioy,velx,vely;
            System.out.println("Insira os valores de: raio, x, y do centro, velocidade X e velocidade Y: ");
            raio = entrada.nextInt();
            raiox= entrada.nextInt();
            raioy = entrada.nextInt();
            velx = entrada.nextInt();
            vely = entrada.nextInt();
            CirculoMovel C1 = new CirculoMovel(raio,raiox,raioy,velx,vely);
            System.out.println("Circulo Criado");
            System.out.println(C1.toString());
            System.out.println("Movendo para cima");
            C1.moverParaCima();
            System.out.println(C1.toString());
            System.out.println("Movendo para direita");
            C1.moverParaDireita();
            System.out.println(C1.toString());
            System.out.println("Movendo para baixo");
            C1.moverParaBaixo();
            System.out.println(C1.toString());
            System.out.println("Movendo para equerda");
            C1.moverParaEsquerda();
            System.out.println(C1.toString());}
        
    }
    
}
