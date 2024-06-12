package com.example.Pattern;

public class Soundbar {
    private boolean ligada = false;
    private String comodo;

    public Soundbar(String comodo) {
        this.comodo = comodo;
    }

    public void ligar() {
        System.out.println("Soundbar da " + this.comodo + " ligado");
        this.ligada = true;
    }

    public void desligar() {
        System.out.println("Soundbar da " + this.comodo + " desligado");
        this.ligada = false;
    }

    public void mostrarStatus() {
        System.out.println("Soundbar da " + this.comodo + "está " + (this.ligada ? " ligado" : " desligado"));
    }

}
