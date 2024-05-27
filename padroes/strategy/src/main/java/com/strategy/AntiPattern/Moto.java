package com.strategy.AntiPattern;

public class Moto extends Veiculo{
    private boolean temSlide;

    public Moto(String marca, String modelo, int ano, boolean temSlide) {
        super(marca, modelo, ano);
        this.temSlide = temSlide;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tem slide: " + (temSlide ? "Sim" : "Não"));
    }

    public boolean isTemSlide() {
        return temSlide;
    }

    public void setTemSlide(boolean temSlide) {
        this.temSlide = temSlide;
    }
}
