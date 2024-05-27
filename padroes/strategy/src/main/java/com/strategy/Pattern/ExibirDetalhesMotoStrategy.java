package com.strategy.Pattern;

public class ExibirDetalhesMotoStrategy implements ExibirDetalhesStrategy{
    private boolean temSlide;

    public ExibirDetalhesMotoStrategy(boolean temSlide) {
        this.temSlide = temSlide;
    }

    @Override
    public void exibirDetalhes(Veiculo veiculo) {
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Tem slide: " + (temSlide ? "Sim" : "Não"));
    }
}
