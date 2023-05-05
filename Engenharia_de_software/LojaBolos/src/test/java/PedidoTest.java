

import com.mycompany.lojabolos.Bolo;
import com.mycompany.lojabolos.Cliente;
import com.mycompany.lojabolos.Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PedidoTest {
    private Pedido pedido;
    private Cliente cliente;
    private Bolo bolo1, bolo2;
    
    @Before
    public void setUp() {
        // Cria um novo cliente
        cliente = new Cliente();
        cliente.setNome("João");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelefone("(11) 1234-5678");
        
        // Cria dois bolos
        bolo1 = new Bolo();
        bolo1.setSabor("Chocolate");
        bolo1.setTamanho("Médio");
        bolo1.setPreco(30.0);
        String[] ingredientes1 = {"chocolate", "leite condensado", "morango"};
        bolo1.setIngredientes(ingredientes1);
        
        bolo2 = new Bolo();
        bolo2.setSabor("Morango");
        bolo2.setTamanho("Pequeno");
        bolo2.setPreco(20.0);
        String[] ingredientes2 = {"morango", "chantilly"};
        bolo2.setIngredientes(ingredientes2);
        
        // Adiciona os dois bolos à lista de bolos do pedido
        List<Bolo> bolos = new ArrayList<>();
        bolos.add(bolo1);
        bolos.add(bolo2);
        
        // Cria um novo pedido
        pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setData(new Date());
        pedido.addBolo(bolo1);
        pedido.addBolo(bolo2);
    }
    
    @Test
    public void testCalcularValorTotal() {
        // Calcula o valor total do pedido
        double valorTotal = pedido.calcularValorTotal();
        
        // Verifica se o valor total está correto
        assertEquals(53.0, valorTotal, 0.01);
    }
}
