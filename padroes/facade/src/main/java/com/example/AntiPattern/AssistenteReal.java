package com.example.AntiPattern;

public class AssistenteReal {
    private boolean soundbarLigado = false;
    private String soundbarComodo;
    private boolean televisaoLigada = false;
    private String televisaoComodo;
    private boolean lampadaLigada = false;
    private String lampadaComodo;

    public AssistenteReal(String soundbarComodo, String televisaoComodo, String lampadaComodo) {
        this.soundbarComodo = soundbarComodo;
        this.televisaoComodo = televisaoComodo;
        this.lampadaComodo = lampadaComodo;
    }

    public void ligarSoundbar() {
        System.out.println("Soundbar da " + this.soundbarComodo + " ligado");
    }

    public void desligarSoundbar() {
        System.out.println("Soundbar da " + this.soundbarComodo + " desligado");
    }

    public void ligarTelevisao() {
        System.out.println("Televisao da " + this.televisaoComodo + " ligada");
        this.televisaoLigada = true;
    }

    public void desligarTelevisao() {
        System.out.println("Televisao da " + this.televisaoComodo + " desligada");
        this.televisaoLigada = false;
    }

    public void ligarLampada() {
        System.out.println("Lâmpada da " + this.lampadaComodo + " ligada");
        this.lampadaLigada = true;
    }

    public void desligarLampada() {
        System.out.println("Lâmpada da " + this.lampadaComodo + " desligada");
        this.lampadaLigada = false;
    }

}
