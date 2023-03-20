import java.util.LinkedList;
import java.util.List;

public class Sabor {
    private String massa;
    private String recheio;
    private String cobertura;
    private List <String> adicionais = new LinkedList<String>();    

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
		adicionais.add(adicional);
	}

    public String getAdicional() {
		return adicional;
	}





}
