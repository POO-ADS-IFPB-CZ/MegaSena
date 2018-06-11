package com.ifpb.megasena.model;

import java.util.Arrays;

public class Jogo {

    private int numeros[];
    private int quantidade;

    public Jogo(int tamanho){
        numeros = new int[tamanho];
        quantidade = 0;
    }

    public boolean inserir(int numero) {
        if(isCheio() || !isValido(numero) || isPresente(numero)) {
            return false;
        }
        numeros[0] = numero;
        Arrays.sort(numeros);
        quantidade++;
        return true;
    }

    public boolean isCheio(){
        return quantidade >= numeros.length;
    }

    public boolean isValido(int numero){
        return numero>0 && numero<=60;
    }

    public boolean isPresente(int numero){
        return Arrays.binarySearch(numeros, numero) >= 0;
    }

    @Override
    public String toString(){
        Arrays.sort(numeros);
        return Arrays.toString(numeros);
    }
}
