package com.strategy;

import com.strategy.AntiPattern.Carro;
import com.strategy.AntiPattern.Moto;
import com.strategy.Pattern.ExibirDetalhesCarroStrategy;
import com.strategy.Pattern.ExibirDetalhesMotoStrategy;
import com.strategy.Pattern.ExibirDetalhesStrategy;
import com.strategy.Pattern.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Anti-Pattern
        Carro apCarro = new Carro("Toyota", "Corolla", 2020, 4);
        Moto apMoto = new Moto("Harley-Davidson", "Street 750", 2019, false);

        System.out.println("Detalhes do Carro:");
        apCarro.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Moto:");
        apMoto.exibirDetalhes();

        // Pattern

        ExibirDetalhesStrategy carroStrategy = new ExibirDetalhesCarroStrategy(4);
        ExibirDetalhesStrategy motoStrategy = new ExibirDetalhesMotoStrategy(false);

        Veiculo pCarro = new Veiculo("Toyota", "Corolla", 2020, carroStrategy);
        Veiculo pMoto = new Veiculo("Harley-Davidson", "Street 750", 2019, motoStrategy);

        System.out.println("Detalhes do Carro:");
        pCarro.exibirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Moto:");
        pMoto.exibirDetalhes();

    }
}