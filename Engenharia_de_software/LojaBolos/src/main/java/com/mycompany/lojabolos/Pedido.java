package com.mycompany.lojabolos;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Date data;
    private List<Bolo> bolos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

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
        bolos.add(bolo);
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
