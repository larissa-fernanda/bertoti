/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojabolos;

/**
 *
 * @author larissa
 */
public class Bolo {
    private String sabor;
    private String tamanho;
    private double preco;
    private String[] ingredientes;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double calcularPrecoTotal() {
        double total = preco;

        // Adiciona o custo dos ingredientes ao preço total
        for (String ingrediente : ingredientes) {
            if (ingrediente.equals("chocolate")) {
                total += 2.0;
            } else if (ingrediente.equals("morango")) {
                total += 1.5;
            } else {
                total += 1.0;
            }
        }

        // Multiplica o preço total pelo fator de aumento do tamanho
        if (tamanho.equals("pequeno")) {
            total *= 1.0;
        } else if (tamanho.equals("médio")) {
            total *= 1.5;
        } else {
            total *= 2.0;
        }

        return total;
    }
}
  

