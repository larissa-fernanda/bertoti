/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author larissa
 */

import com.mycompany.lojabolos.Bolo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BoloTest {
    
    @Test
    public void testCalcularPrecoTotal() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[] {"chocolate", "morango"});
        
        double precoEsperado = 13.5;
        double precoCalculado = bolo.calcularPrecoTotal();
        
        assertEquals(precoEsperado, precoCalculado, 0.01);
    }
    
    @Test
    public void testCalcularPrecoTotalSemIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[] {});
        
        double precoEsperado = 10.0;
        double precoCalculado = bolo.calcularPrecoTotal();
        
        assertEquals(precoEsperado, precoCalculado, 0.01);
    }
    
    @Test
    public void testCalcularPrecoTotalTamanhoMedio() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("médio");
        bolo.setIngredientes(new String[] {"chocolate", "morango"});
        
        double precoEsperado = 20.25;
        double precoCalculado = bolo.calcularPrecoTotal();
        
        assertEquals(precoEsperado, precoCalculado, 0.01);
    }
    
    @Test
    public void testCalcularPrecoTotalTamanhoGrande() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("grande");
        bolo.setIngredientes(new String[] {"chocolate", "morango"});
        
        double precoEsperado = 27.0;
        double precoCalculado = bolo.calcularPrecoTotal();
        
        assertEquals(precoEsperado, precoCalculado, 0.01);
    }
}
