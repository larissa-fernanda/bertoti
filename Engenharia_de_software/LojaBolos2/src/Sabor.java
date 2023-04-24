public class Sabor {
    private String massa;
    private String recheio;
    private String cobertura;
    private String adicional;
    
    public String getMassa(){
        return massa;
    }

    public String getRecheio(){
        return recheio;
    }

    public String getCobertura(){
        return cobertura;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public String getAdicional() {
        return adicional;
    }
}
