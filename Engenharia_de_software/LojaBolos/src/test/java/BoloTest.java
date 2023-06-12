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
    public void testCalcularPrecoTotalTamanhoPequenoSemIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{});

        double precoEsperado = 10.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoMedioSemIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("médio");
        bolo.setIngredientes(new String[]{});

        double precoEsperado = 15.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoGrandeSemIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("grande");
        bolo.setIngredientes(new String[]{});

        double precoEsperado = 20.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoPequenoComUmIngrediente() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{"chocolate"});

        double precoEsperado = 12.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoMedioComUmIngrediente() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("médio");
        bolo.setIngredientes(new String[]{"chocolate"});

        double precoEsperado = 18.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoGrandeComUmIngrediente() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("grande");
        bolo.setIngredientes(new String[]{"chocolate"});

        double precoEsperado = 24.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoPequenoComCincoIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{"chocolate", "morango", "baunilha", "laranja", "limão"});

        double precoEsperado = 16.5;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoMedioComCincoIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("médio");
        bolo.setIngredientes(new String[]{"chocolate", "morango", "baunilha", "laranja", "limão"});

        double precoEsperado = 24.75;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoGrandeComCincoIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("grande");
        bolo.setIngredientes(new String[]{"chocolate", "morango", "baunilha", "laranja", "limão"});

        double precoEsperado = 33.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalComPrecoNegativo() {
        Bolo bolo = new Bolo();
        bolo.setPreco(-5.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{"chocolate", "morango"});

        double precoEsperado = -1.5;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);

    }
    
    @Test
    public void testCalcularPrecoTotalTamanhoGrande() {
        Bolo bolo = new Bolo();
        bolo.setSabor("limão");
        bolo.setTamanho("grande");
        bolo.setPreco(25.0);
        String[] ingredientes = {"chocolate", "morango"};
        bolo.setIngredientes(ingredientes);
        
        double precoEsperado = 57.0;
        double precoCalculado = bolo.calcularPrecoTotal();
        
        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testSetAndGetSabor() {
        Bolo bolo = new Bolo();
        bolo.setSabor("chocolate");
        
        assertEquals("chocolate", bolo.getSabor());
    }
    
    @Test
    public void testSetAndGetTamanho() {
        Bolo bolo = new Bolo();
        bolo.setTamanho("médio");
        
        assertEquals("médio", bolo.getTamanho());
    }
    
    @Test
    public void testSetAndGetPreco() {
        Bolo bolo = new Bolo();
        bolo.setPreco(20.0);
        
        assertEquals(20.0, bolo.getPreco(), 0.01);
    }
    
    @Test
    public void testSetAndGetIngredientes() {
        Bolo bolo = new Bolo();
        String[] ingredientes = {"morango", "granulado"};
        bolo.setIngredientes(ingredientes);
        
        assertEquals(ingredientes, bolo.getIngredientes());
    }   
}
