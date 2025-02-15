package com.fabricadebolo.model;

public class BoloDeArroz extends Bolo implements PrepararBolo{

    String cobertura;

    public BoloDeArroz(String sabor, int tamanho, String cobertura) {
        super(sabor, tamanho);
        this.cobertura = cobertura;
    }

    @Override
    public void preparar() {
        System.out.println("Misturando os ingredientes do bolo de arroz");
    }

    @Override
    public void assar() {
        System.out.println("Assando o bolo de arroz");
    }

    @Override
    public void decorar() {
        System.out.println("Decorando o bolo de arroz");
    }
}
