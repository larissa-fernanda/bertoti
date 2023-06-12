/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larissa
 */

import com.mycompany.lojabolos.Cliente;
import com.mycompany.lojabolos.LojaBolos;
import com.mycompany.lojabolos.Pedido;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LojaBolosTest {

    private LojaBolos loja;
    private Cliente cliente1, cliente2;
    private Pedido pedido1, pedido2;

    @Before
    public void setUp() {
        loja = new LojaBolos();

        cliente1 = new Cliente();
        cliente1.setNome("João");
        cliente1.setEndereco("Rua A, 123");
        cliente1.setTelefone("(11) 99999-9999");

        cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setEndereco("Rua B, 456");
        cliente2.setTelefone("(11) 88888-8888");

        pedido1 = new Pedido();
        cliente1.addPedido(pedido1);

        pedido2 = new Pedido();
        cliente2.addPedido(pedido2);

        loja.addCliente(cliente1);
        loja.addCliente(cliente2);
    }

    @Test
    public void testGetClientes() {
        List<Cliente> clientes = loja.getClientes();
        assertEquals(2, clientes.size());
        assertTrue(clientes.contains(cliente1));
        assertTrue(clientes.contains(cliente2));
    }

    @Test
    public void testAddCliente() {
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pedro");
        cliente3.setEndereco("Rua C, 789");
        cliente3.setTelefone("(11) 77777-7777");

        loja.addCliente(cliente3);

        List<Cliente> clientes = loja.getClientes();
        assertEquals(3, clientes.size());
        assertTrue(clientes.contains(cliente3));
    }

    @Test
    public void testRemoveCliente() {
        loja.removeCliente(cliente1);

        List<Cliente> clientes = loja.getClientes();
        assertEquals(1, clientes.size());
        assertFalse(clientes.contains(cliente1));
    }

    @Test
    public void testGetClientesSemClientes() {
        LojaBolos loja2 = new LojaBolos();

        List<Cliente> clientes = loja2.getClientes();
        assertNotNull(clientes);
        assertTrue(clientes.isEmpty());
    }

    @Test
    public void testAddPedido() {
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pedro");
        cliente3.setEndereco("Rua C, 789");
        cliente3.setTelefone("(11) 77777-7777");

        Pedido pedido3 = new Pedido();
        cliente3.addPedido(pedido3);

        loja.addCliente(cliente3);

        List<Cliente> clientes = loja.getClientes();
        assertEquals(3, clientes.size());
        assertTrue(clientes.contains(cliente3));

        List<Pedido> pedidos = cliente3.getPedidos();
        assertEquals(1, pedidos.size());
        assertTrue(pedidos.contains(pedido3));
    }

    @Test
    public void testGetClientesComPedidos() {
        List<Cliente> clientes = loja.getClientes();
        assertEquals(2, clientes.size());

        Cliente cliente1 = clientes.get(0);
        Cliente cliente2 = clientes.get(1);

        List<Pedido> pedidos1 = cliente1.getPedidos();
        assertEquals(1, pedidos1.size());
        assertTrue(pedidos1.contains(pedido1));

        List<Pedido> pedidos2 = cliente2.getPedidos();
        assertEquals(1, pedidos2.size());
        assertTrue(pedidos2.contains(pedido2));
    }

    @Test
    public void testGetClientesSemPedidos() {
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Pedro");
        cliente3.setEndereco("Rua C, 789");
        cliente3.setTelefone("(11) 77777-7777");

        loja.addCliente(cliente3);

        List<Cliente> clientes = loja.getClientes();
        assertEquals(3, clientes.size());

    }
}
