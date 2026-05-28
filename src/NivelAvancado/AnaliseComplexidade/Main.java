package NivelAvancado.BigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static void main(String[] args) {

        Long inicio;
        Long fim;
        Long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 90500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        inicio = System.nanoTime();
        arrayList.remove(980);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo ArrayList: " + tempo + "ns");

        inicio = System.nanoTime();
        linkedList.remove(980);
        fim = System.nanoTime();

        tempo = fim - inicio;
        System.out.println("Tempo LinkedList: " + tempo + "ns");

    }
}
