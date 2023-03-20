public class Sala {
    private int numeroCadeiras;
    private String filme;

    public Sala(int numeroCadeiras, String filme){
        this.numeroCadeiras = numeroCadeiras;
        this.filme = filme;
    }

    public void setNumeroCadeiras (int numeroCadeiras){
        this.numeroCadeiras = numeroCadeiras;
    }

    public int getNumeroCadeiras(){
        return numeroCadeiras;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public String getFilme(){
        return filme;
    }
}
