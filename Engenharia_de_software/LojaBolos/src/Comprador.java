public class Comprador {
    private String cpf;
    private String nome;
    private int telefone;
    private Endereco endereco;

    public String getCpf() {
		return cpf;
	}
    public String getNome() {
		return nome;
	}
    public int getTelefone() {
		return telefone;
	}
    public Endereco getEndereco() {
		return endereco;
	}
  public void setCpf(String cpf) {
		this.cpf = cpf;
	}
  public void setNome(String nome) {
		this.nome = nome;
	}
  public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
  public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
