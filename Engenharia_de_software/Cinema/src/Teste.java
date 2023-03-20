import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Cinema cine = new Cinema();
        
        cine.addSala(new Sala(20, "Vingadores Ultimato"));
        cine.addSala(new Sala(20, "John Wick 4"));

        List<Sala> salasEncontradas = cine.buscarSalaPorFilme("Vingadores Ultimato");

        for (Sala sala: salasEncontradas){
            System.out.println(sala.getFilme() + ", " + sala.getNumeroCadeiras());
        }
    }
}
