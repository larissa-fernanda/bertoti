import org.junit.Test;
import static org.junit.Assert.*;

public class Teste {
    
    @Test
    public void testGetMassa() {
        Sabor sabor = new Sabor();
        sabor.setMassa("chocolate");
        assertEquals("chocolate", sabor.getMassa());
    }
    
    @Test
    public void testSetAdicional() {
        Sabor sabor = new Sabor();
        sabor.setAdicional("morango");
        assertEquals("morango", sabor.getAdicional());
    }
}