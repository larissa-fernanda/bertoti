package com.example;

import com.example.instance.Eu;

public class Main {
    public static void main(String[] args) {

        Eu eu = Eu.getInstance("João");
        Eu eu2 = Eu.getInstance("Maria");

        eu.meApresentar();
        eu.falar("Olá, tudo bem?");
        eu.comer();
        eu.fazerAcao("exercício");
        eu.dormir();
        eu.sentir("TRISTE");
        eu.dormir();
        eu.comer();
        eu.dormir();
        eu.fazerAcao("exercício");
        eu.dormir();
        eu.fazerAniversario();
        eu.meApresentar();

    }
}