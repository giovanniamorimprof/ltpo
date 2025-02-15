package com.fabricadebolo.model;

public class Bolo {

    private String sabor;
    private int tamanho;
    private int peso;

    public Bolo (String sabor, int tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public void exibirDetalhes() {
        System.out.println("Bolo de " + sabor + " de tamanho " + tamanho + "cm.");
    }
}
