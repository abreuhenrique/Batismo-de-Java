package NivelAvancado.Stream;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 26));
        ninjas.add(new Ninja("Kankuro", "Areia", 14));
        ninjas.add(new Ninja("Hiruzen Sarutobi", "Konoha", 69));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 20));
        ninjas.add(new Ninja("Killer Bee", "Nuvem", 35));

        /*ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Nuvem"))
                .forEach(System.out::println);*/

        /*ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);*/
    }
}
