package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> ferramentas;

    //Adicionar item
    public void addFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //Mostrar Ferramentas
    public void mostrarFerramentas() {
        for(T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    public List<T> getBolsaNinja() {
        return ferramentas;
    }

    public void setBolsaNinja(List<T> bolsaNinja) {
        this.ferramentas = bolsaNinja;
    }

}
