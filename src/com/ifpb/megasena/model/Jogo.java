package com.ifpb.megasena.model;

public class Jogo {

    private int numeros[];
    private int quantidade;

    public Jogo(int tamanho){
        numeros = new int[tamanho];
        quantidade = 0;
    }

    public boolean inserir(int numero) {
        if(isCheio()) {
            return false;
        }
        numeros[quantidade++] = numero;
        return true;
    }

    public boolean isCheio(){
        return quantidade >= numeros.length;
    }

    @Override
    public String toString(){
        String retorno = "";

        for(int i : numeros){
            retorno += i + " ";
        }
        return retorno += "\n";
    }
}
