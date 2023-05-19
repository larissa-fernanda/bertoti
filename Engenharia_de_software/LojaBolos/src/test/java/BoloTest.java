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

        double precoEsperado = 11.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoMedioComUmIngrediente() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("médio");
        bolo.setIngredientes(new String[]{"chocolate"});

        double precoEsperado = 16.5;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoGrandeComUmIngrediente() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("grande");
        bolo.setIngredientes(new String[]{"chocolate"});

        double precoEsperado = 22.0;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoTotalTamanhoPequenoComCincoIngredientes() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{"chocolate", "morango", "baunilha", "laranja", "limão"});

        double precoEsperado = 13.5;
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

    @Test(expected = IllegalArgumentException.class)
    public void testCalcularPrecoTotalComTamanhoInvalido() {
        Bolo bolo = new Bolo();
        bolo.setPreco(10.0);
        bolo.setTamanho("extra-grande");
        bolo.setIngredientes(new String[]{"chocolate", "morango"});

        bolo.calcularPrecoTotal();
    }

    @Test
    public void testCalcularPrecoTotalComPrecoNegativo() {
        Bolo bolo = new Bolo();
        bolo.setPreco(-5.0);
        bolo.setTamanho("pequeno");
        bolo.setIngredientes(new String[]{"chocolate", "morango"});

        double precoEsperado = -1.75;
        double precoCalculado = bolo.calcularPrecoTotal();

        assertEquals(precoEsperado, precoCalculado, 0.01);

    }
}
