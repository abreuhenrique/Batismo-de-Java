package NivelIntermediario.Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        //Array
        //Estatico e Não altera de Tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sakura Haruno";
        ninjasArray[2] = "Sasuke Uchiha";

        //Referencia de Memoria
        System.out.println(ninjasArray);

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Ninja: " + ninjasArray[i]);
        }
        System.out.println("-------------------- List --------------------");
        //List
        //Não é Estatica, pode aumentar de Tamanho
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzukraki");
        ninjasList.add("Kakashi Hatake");
        System.out.println("Ninjas: " + ninjasList);
        ninjasList.remove("Kakashi Hatake");
        ninjasList.set(0, "Naruto Uzumaki");
        System.out.println("Ninjas: " + ninjasList);
        System.out.println("Tamanho da Lista: " + ninjasList.size());

    }
}
