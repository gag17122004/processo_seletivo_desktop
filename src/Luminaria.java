import java.util.ArrayList;
import java.util.List;

public class Luminaria extends ItemAmbiente {
    private final List<Teclado> acionadores;

    public Luminaria(String nome) {
        super(nome);
        this.acionadores = new ArrayList<>();
    }

    public boolean adicionarAcionadores(Teclado teclado){
        if (!acionadores.contains(teclado)){
            acionadores.add(teclado);
            return true;
        }
        return false;
    }
}
