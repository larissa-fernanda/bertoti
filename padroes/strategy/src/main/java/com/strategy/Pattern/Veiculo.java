package com.strategy.Pattern;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private ExibirDetalhesStrategy exibirDetalhesStrategy;

    public Veiculo(String marca, String modelo, int ano, ExibirDetalhesStrategy exibirDetalhesStrategy) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.exibirDetalhesStrategy = exibirDetalhesStrategy;
    }

    public void exibirDetalhes() {
        exibirDetalhesStrategy.exibirDetalhes(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
