/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larissa
 */
import com.mycompany.lojabolos.Bolo;
import com.mycompany.lojabolos.Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PedidoTest {

    private Pedido pedido, pedido1, pedido2;
    private Bolo bolo1;
    private Bolo bolo2;

    @Before
    public void setUp() {
        pedido = new Pedido();
        pedido1 = new Pedido();
        pedido2 = new Pedido();

        bolo1 = new Bolo();
        bolo1.setSabor("Chocolate");
        bolo1.setTamanho("Médio");
        bolo1.setPreco(30.0);
        String[] ingredientesBolo1 = {"chocolate", "morango"};
        bolo1.setIngredientes(ingredientesBolo1);

        bolo2 = new Bolo();
        bolo2.setSabor("Baunilha");
        bolo2.setTamanho("Pequeno");
        bolo2.setPreco(20.0);
        String[] ingredientesBolo2 = {"leite condensado"};
        bolo2.setIngredientes(ingredientesBolo2);

        pedido.addBolo(bolo1);
        pedido.addBolo(bolo2);
    }

    @Test
    public void testGetData() {
        Date data = new Date();
        pedido.setData(data);
        assertEquals(data, pedido.getData());
    }

    @Test
    public void testAddBolo() {
        Bolo bolo3 = new Bolo();
        bolo3.setSabor("Cenoura");
        bolo3.setTamanho("Grande");
        bolo3.setPreco(50.0);
        String[] ingredientesBolo3 = {"nozes", "coco"};
        bolo3.setIngredientes(ingredientesBolo3);

        pedido.addBolo(bolo3);
        List<Bolo> bolos = pedido.getBolos();

        assertEquals(3, bolos.size());
        assertEquals(bolo3, bolos.get(2));
    }

    @Test
    public void testGetBolos() {
        List<Bolo> bolosEsperados = new ArrayList<>();
        bolosEsperados.add(bolo1);
        bolosEsperados.add(bolo2);

        List<Bolo> bolosCalculados = pedido.getBolos();

        assertEquals(bolosEsperados, bolosCalculados);
    }

    @Test
    public void testCalcularValorTotal() {
        double valorTotalEsperado = bolo1.calcularPrecoTotal() + bolo2.calcularPrecoTotal();
        double valorTotalCalculado = pedido.calcularValorTotal();

        assertEquals(valorTotalEsperado, valorTotalCalculado, 0.001);
    }

    @Test
    public void testCalcularValorTotalSemBolos() {
        Pedido novoPedido = new Pedido();
        double valorTotalEsperado = 0.0;
        double valorTotalCalculado = novoPedido.calcularValorTotal();

        assertEquals(valorTotalEsperado, valorTotalCalculado, 0.001);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetBoloPosicaoInvalida() {
        pedido.getBolos().get(2);
    }

    @Test
    public void testCalculaValorTotalPedidoUmBolo() {
        pedido.addBolo(bolo1);

        double valorEsperado = 176.0;
        double valorObtido = pedido.calcularValorTotal();

        assertEquals(valorEsperado, valorObtido, 0.001);
    }

    @Test
    public void testAdicionaBoloPedido() {
        Pedido pedido = new Pedido();
        pedido.addBolo(bolo2);

        assertTrue(pedido.getBolos().contains(bolo2));
    }

    @Test
    public void testCalculaValorTotalPedidoVariosBolos() {
        Pedido pedido = new Pedido();
        pedido.addBolo(bolo1);
        pedido.addBolo(bolo2);

        double valorEsperado = 109.0;
        double valorObtido = pedido.calcularValorTotal();

        assertEquals(valorEsperado, valorObtido, 0.001);
    }

    @Test
    public void testCalculaValorTotalPedidoSemBolos() {
        Pedido pedido = new Pedido();

        double valorEsperado = 0.0;
        double valorObtido = pedido.calcularValorTotal();

        assertEquals(valorEsperado, valorObtido, 0.001);
    }

    @Test
    public void testRemoveBoloPedido() {
        Pedido pedido = new Pedido();
        pedido.addBolo(bolo1);
        pedido.addBolo(bolo2);

        pedido.getBolos().remove(bolo1);

        assertFalse(pedido.getBolos().contains(bolo1));
        assertTrue(pedido.getBolos().contains(bolo2));
    }
}
