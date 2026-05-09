package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    List<T> ferramentas;

    //Colocar Ferramentas
    public void addFerramentas(T ferramentaGenerica) {
        ferramentas.add(ferramentaGenerica);
    }

    public BolsaGenerica() {
        this.ferramentas = new ArrayList<>();
    }

    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    @Override
    public String toString() {
        return "Bolsa de Ferramentas Ninja: " + ferramentas;
    }
}
