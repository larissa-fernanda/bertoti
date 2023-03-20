import java.util.LinkedList;
import java.util.List;

public class Cinema {
    private List<Sala> salas = new LinkedList<Sala>();

    public void addSala(Sala sala){
        salas.add(sala);
    }

    public List<Sala> buscarSalaPorFilme(String filme){
        List<Sala> encontrados = new LinkedList<Sala>();
        for (Sala sala:salas){
            if (sala.getFilme().equals(filme))
                encontrados.add(sala);
        }
        return encontrados;
    }
}
