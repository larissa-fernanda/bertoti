package com.strategy.Pattern;

public class ExibirDetalhesCarroStrategy implements ExibirDetalhesStrategy{
    private int numeroDePortas;

    public ExibirDetalhesCarroStrategy(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes(Veiculo veiculo) {
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Número de portas: " + numeroDePortas);
    }

    public int getNumeroDePortas() {
        return this.numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
}
