package com.strategy;

import com.strategy.Pattern.Pessoa;

import com.strategy.Pattern.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa pessoa = new Pessoa("Joquinha", 35);

        pessoa.setPergunta(new Questao());

        pessoa.perguntar();

    }
}