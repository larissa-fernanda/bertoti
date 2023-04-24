public class Pedido {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(12345678, "Rua exemplo", 123,"Apto 101");

        Comprador comprador1 = new Comprador();
        comprador1.setCpf("12344583829");
        comprador1.setNome("zezinho");
        comprador1.setTelefone(112343453);
        comprador1.setEndereco(endereco);
        comprador1.getCpf();
        comprador1.getNome();
        comprador1.getTelefone();
        comprador1.getEndereco();
        

    }
}
