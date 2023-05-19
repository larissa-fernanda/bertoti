/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author larissa
 */

import com.mycompany.lojabolos.Cliente;
import com.mycompany.lojabolos.Pedido;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

    private Cliente cliente;
    private Pedido pedido1;
    private Pedido pedido2;

    @Before
    public void setUp() {
        cliente = new Cliente();
        cliente.setNome("João");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelefone("(11) 1234-5678");
        pedido1 = new Pedido();
        pedido2 = new Pedido();
    }

    @Test
    public void testGetNome() {
        assertEquals("João", cliente.getNome());
    }

    @Test
    public void testSetNome() {
        cliente.setNome("Maria");
        assertEquals("Maria", cliente.getNome());
    }

    @Test
    public void testGetEndereco() {
        assertEquals("Rua A, 123", cliente.getEndereco());
    }

    @Test
    public void testSetEndereco() {
        cliente.setEndereco("Rua B, 456");
        assertEquals("Rua B, 456", cliente.getEndereco());
    }

    @Test
    public void testGetTelefone() {
        assertEquals("(11) 1234-5678", cliente.getTelefone());
    }

    @Test
    public void testSetTelefone() {
        cliente.setTelefone("(11) 9876-5432");
        assertEquals("(11) 9876-5432", cliente.getTelefone());
    }

    @Test
    public void testGetPedidos() {
        List<Pedido> pedidos = new ArrayList<>();
        assertEquals(pedidos, cliente.getPedidos());
    }

    @Test
    public void testAddPedido() {
        cliente.addPedido(pedido1);
        assertEquals(1, cliente.getPedidos().size());
        cliente.addPedido(pedido2);
        assertEquals(2, cliente.getPedidos().size());
    }
}
