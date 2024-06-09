package com.example.AntiPattern;

public class Soundbar {
    private boolean ligada = false;
    private String comodo;

    public Soundbar(String comodo) {
        this.comodo = comodo;
    }

    public void ligar() {
        System.out.println("Soundbar da " + this.comodo + "ligado");
    }

    public void desligar() {
        System.out.println("Soundbar da " + this.comodo + "desligado");
    }

}
