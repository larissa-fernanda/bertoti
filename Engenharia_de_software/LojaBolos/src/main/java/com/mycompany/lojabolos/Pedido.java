/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojabolos;

/**
 *
 * @author larissa
 */
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date data;
    private List<Bolo> bolos;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Bolo> getBolos() {
        return bolos;
    }

    public void addBolo(Bolo bolo) {
        this.bolos.add(bolo);
    }

    public double calcularValorTotal() {
        double total = 0.0;

        // Calcula o valor total somando o valor de cada bolo
        for (Bolo bolo : bolos) {
            total += bolo.calcularPrecoTotal();
        }

        return total;
    }
}
