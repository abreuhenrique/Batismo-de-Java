package NivelIntermediario.HashSet;

import java.util.*;

public class Main {
    static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuske Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Tobirama Senju");
        ninjas.add("Hashirama Senju");

        System.out.println(ninjas);

        //Não segue uma ordem especifica
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);

        System.out.println(ninjasSet);

        //Na ordem de Implementação
        Set<String> ninjaLSet = new LinkedHashSet<>();
        ninjaLSet.addAll(ninjas);

        System.out.println(ninjaLSet);

        //Ordem Alfabetica
        Set<String> ninjaTSet = new TreeSet<>();
        ninjaTSet.addAll(ninjas);

        System.out.println(ninjaTSet);
    }
}
