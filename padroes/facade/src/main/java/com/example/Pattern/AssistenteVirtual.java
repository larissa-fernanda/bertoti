package com.example.Pattern;

public class AssistenteVirtual {
    private Lampada lampada;
    private Soundbar soundbar;
    private Televisao televisao;

    public AssistenteVirtual(String comodo) {
        this.lampada = new Lampada(comodo);
        this.soundbar = new Soundbar(comodo);
        this.televisao = new Televisao(comodo);
    }

    public AssistenteVirtual(Lampada lampada, Soundbar soundbar, Televisao televisao) {
        this.lampada = lampada;
        this.soundbar = soundbar;
        this.televisao = televisao;
    }

    public void ligarCasa() {
        lampada.ligar();
        soundbar.ligar();
        televisao.ligar();
    }

    public void desligarCasa() {
        lampada.desligar();
        soundbar.desligar();
        televisao.desligar();
    }

    public void verFilme() {
        lampada.desligar();
        soundbar.ligar();
        televisao.ligar();
    }

    public void ouvirMusica() {
        lampada.desligar();
        soundbar.ligar();
        televisao.desligar();
    }

    public void dormir() {
        lampada.desligar();
        soundbar.desligar();
        televisao.desligar();
    }

    public void acordar() {
        lampada.ligar();
        soundbar.desligar();
        televisao.ligar();
    }

    public void focar() {
        lampada.ligar();
        soundbar.desligar();
        televisao.desligar();
    }

    public void mostrarStatus() {
        lampada.mostrarStatus();
        soundbar.mostrarStatus();
        televisao.mostrarStatus();
    }

}
