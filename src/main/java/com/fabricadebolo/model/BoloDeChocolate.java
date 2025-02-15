package com.fabricadebolo.model;

public class BoloDeChocolate implements PrepararBolo{

    private String cobertura = "Cobertura de chocolate";

    @Override
    public void preparar() {
        System.out.println("Misturando os ingredientes do bolo de chocolate");
    }

    @Override
    public void assar() {
        System.out.println("Assando o bolo de chocolate");
    }

    @Override
    public void decorar() {
        System.out.println("Decorando o bolo de chocolate");
    }
}
