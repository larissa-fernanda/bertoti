package com.example;

import com.example.AntiPattern.AssistenteReal;
import com.example.Pattern.Lampada;
import com.example.Pattern.Soundbar;
import com.example.Pattern.Televisao;
import com.example.Pattern.AssistenteVirtual;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // AntiPattern
        AssistenteReal assistenteReal = new AssistenteReal("Sala", "Sala", "Sala");
        assistenteReal.ligarSoundbar();
        assistenteReal.ligarTelevisao();
        assistenteReal.ligarLampada();
        assistenteReal.desligarSoundbar();
        assistenteReal.desligarTelevisao();
        assistenteReal.desligarLampada();

        System.out.println("====================================");
        // Pattern

        AssistenteVirtual assistente = new AssistenteVirtual("Quarto");

        assistente.ouvirMusica();

        assistente.verFilme();

        assistente.acordar();


    }
}