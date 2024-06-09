package com.example;

import com.example.AntiPattern.Lampada;
import com.example.AntiPattern.Soundbar;
import com.example.AntiPattern.Televisao;

import com.example.Pattern.Lampada;
import com.example.Pattern.Soundbar;
import com.example.Pattern.Televisao;
import com.example.Pattern.AssistenteVirtual;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // AntiPattern
        Lampada antiLampada = new Lampada();
        antiLampada.ligar();
        antiLampada.desligar();

        // Pattern
        com.example.Pattern.Lampada patlampada = new com.example.Pattern.Lampada();
        com.example.Pattern.Soundbar patSoundbar = new com.example.Pattern.Soundbar();
        com.example.Pattern.Televisao patTelevisao = new com.example.Pattern.Televisao();

        AssistenteVirtual assistente = new AssistenteVirtual(patlampada, patSoundbar, patTelevisao);

        assistente.ouvirMusica();

        assistente.verFilme();

        assistente.acordar();


    }
}