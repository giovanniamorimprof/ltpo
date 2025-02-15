package com.fabricadebolo;

import com.fabricadebolo.model.Bolo;
import com.fabricadebolo.model.BoloDeArroz;
import com.fabricadebolo.model.BoloDeChocolate;
import com.fabricadebolo.model.BoloDeMorango;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criando um objeto bolo
        Bolo bolo = new Bolo("Comum", 20);
        bolo.exibirDetalhes();

        System.out.println("---------------------------");
        // Criando um bolo de chocolate
        BoloDeChocolate boloDeChocolate = new BoloDeChocolate();
        boloDeChocolate.preparar();
        boloDeChocolate.assar();
        boloDeChocolate.decorar();

        System.out.println("---------------------------");
        //Criando um bolo de morango
        BoloDeMorango boloDeMorango = new BoloDeMorango("Morango");
        boloDeMorango.preparar();
        boloDeMorango.assar();
        boloDeMorango.decorar();

        System.out.println("---------------------------");
        // Criando um bolo de arroz
        BoloDeArroz boloDeArroz = new BoloDeArroz("Arroz branco", 30, "Morango");
        boloDeArroz.preparar();
        boloDeArroz.assar();
        boloDeArroz.decorar();
    }
}