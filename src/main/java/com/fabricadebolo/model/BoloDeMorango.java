package com.fabricadebolo.model;

public class BoloDeMorango implements PrepararBolo{

    private String cobertura = "Cobertura de morango";

    public BoloDeMorango(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public void preparar() {
        System.out.println("Misturando os ingrediente de um bolo de morango");
    }

    @Override
    public void assar() {
        System.out.println("Assando o bolo de morango");
    }

    @Override
    public void decorar() {
        System.out.println("Decorando o bolo de morango");
    }
}
