/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojabolos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author larissa
 */
public class LojaBolos {
    private List<Cliente> clientes;

    public LojaBolos() {
        this.clientes = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removeCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }
}
