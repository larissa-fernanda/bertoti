/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojabolos;

/**
 *
 * @author larissa
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void testCriarCliente() {
        // Cria um cliente
        Cliente cliente = new Cliente("João", "12345678901", "joao@gmail.com");

        // Verifica se as informações do cliente estão corretas
        assertEquals("João", cliente.getNome());
        assertEquals("12345678901", cliente.getCpf());
        assertEquals("joao@gmail.com", cliente.getEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCpfInvalido() {
        // Cria um cliente com CPF inválido
        Cliente cliente = new Cliente("Maria", "1234567890", "maria@gmail.com");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmailInvalido() {
        // Cria um cliente com e-mail inválido
        Cliente cliente = new Cliente("Pedro", "98765432100", "pedro@@gmail.com");
    }
}
