package com.example.Pattern;

public class Lampada {
    private boolean ligada = false;
    private String comodo;

    public Lampada(String comodo) {
        this.comodo = comodo;
    }

    public void ligar() {
        System.out.println("Lâmpada da " + this.comodo + "ligada");
        this.ligada = true;
    }

    public void desligar() {
        System.out.println("Lâmpada da " + this.comodo + "desligada");
        this.ligada = false;
    }

    public void mostrarStatus() {
        System.out.println("Lâmpada da " + this.comodo + "está " + (this.ligada ? "ligada" : "desligada"));
    }

}
