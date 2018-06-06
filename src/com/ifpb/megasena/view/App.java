package com.ifpb.megasena.view;

import com.ifpb.megasena.model.Jogo;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos jogos deseja fazer?");
        int quantidade = scanner.nextInt();

        Jogo jogos[] = new Jogo[quantidade];

        for(int i=0; i<jogos.length;i++){
            System.out.println("Quantos números tem o jogo?");
            int numeros = scanner.nextInt();

            jogos[i] = new Jogo(numeros);

            while(!jogos[i].isCheio()){
                System.out.println("Digite um número:");
                int numero = scanner.nextInt();
                jogos[i].inserir(numero);
            }
        }

        for(Jogo jogo : jogos){
            System.out.println(jogo);
        }

    }

}
