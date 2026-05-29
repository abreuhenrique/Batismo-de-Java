package NivelAvancado.BigO;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
        ninjas.add(new Ninja("Naruto Uzumaki", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", 17));
        ninjas.add(new Ninja("Sakura Haruno", 17));

        // Algoritmo O(1) - Complexidade Constante
        System.out.println(ninjas.get(0));

        // Algoritmo O(n) - Complexidade Linear
        for(Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

    }
}
