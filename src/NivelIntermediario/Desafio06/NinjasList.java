package NivelIntermediario.Desafio06;

import java.util.ArrayList;
import java.util.LinkedList;

public class NinjasList extends Ninja{

    private LinkedList ninjasList;

    public NinjasList() {
        this.ninjasList = new LinkedList<>();
    }

    //Metodos da Lista
    public void addNinja(String nome, String aldeia, int idade) {
        ninjasList.addFirst(nome);
    }
}