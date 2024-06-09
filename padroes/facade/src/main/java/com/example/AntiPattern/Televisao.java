package com.example.AntiPattern;

public class Televisao {
    private boolean ligada = false;
    private String comodo;

    public Televisao(String comodo) {
        this.comodo = comodo;
    }

    public void ligar() {
        System.out.println("Televisao da " + this.comodo + "ligada");
        this.ligada = true;
    }

    public void desligar() {
        System.out.println("Televisao da " + this.comodo + "desligada");
        this.ligada = false;
    }

}
