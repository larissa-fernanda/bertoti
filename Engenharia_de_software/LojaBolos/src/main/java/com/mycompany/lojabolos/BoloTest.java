/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojabolos;

/**
 *
 * @author larissa
 */
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoloTest {

    @Test
    public void testCalcularPrecoTotal() {
        // Cria um bolo de chocolate com preço 30.0, peso 1.0 kg e ingredientes "farinha", "açúcar" e "chocolate em pó"
        Bolo bolo = new Bolo("Chocolate", 30.0, 1.0, Arrays.asList("farinha", "açúcar", "chocolate em pó"));

        // Verifica se o preço total do bolo está correto
        assertEquals(35.0, bolo.calcularPrecoTotal(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPesoNegativo() {
        // Cria um bolo de baunilha com peso negativo
        Bolo bolo = new Bolo("Baunilha", 20.0, -0.5, Arrays.asList("farinha", "açúcar", "ovos"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrecoNegativo() {
        // Cria um bolo de morango com preço negativo
        Bolo bolo = new Bolo("Morango", -15.0, 1.5, Arrays.asList("farinha", "açúcar", "morangos"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIngredientesVazio() {
        // Cria um bolo de limão sem ingredientes
        Bolo bolo = new Bolo("Limonada", 25.0, 2.0, Collections.emptyList());
    }
}
