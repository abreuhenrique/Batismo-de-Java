package NivelIntermediario.Desafio06;

import java.util.ArrayList;
import java.util.Comparator;
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

    //Remover por Index
    public void removeNinjaIndex(int index) {
        ninjasList.remove(index);
    }
    //Remover por Nome
    public void removeNinjaName(String nome) {
        ninjasList.remove(nome);
    }

    public void mostraLista() {
        for (int i = 0; i < ninjasList.size(); i++) {
            System.out.println("Index: " + i + " - " + ninjasList.get(i));
        }
    }

    public void mostrarNinjaIndex(int index) {
        System.out.println(ninjasList.get(index));
    }

}