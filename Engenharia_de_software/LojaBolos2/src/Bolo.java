public class Bolo {
    private int id;
    private int lote;
    private Sabor sabor;
    private double peso;
    private double preco;

    public int getId() {
		return id;
	}
    public int getLote() {
		return lote;
	}
    public Sabor getSabor() {
		return sabor;
	}
    public double getPeso() {
		return peso;
	}
    public double getPreco() {
		return preco;
	}
  public void setId(int id) {
		this.id = id;
	}
    public void setLote(int lote) {
		this.lote = lote;
	}
    public void setSabor(Sabor sabor) {
		this.sabor = sabor;
	}
    public void setPeso(double peso) {
		this.peso =  peso;
	}
    public void setPreco(double preco) {
		this.preco = preco;
	}

}
