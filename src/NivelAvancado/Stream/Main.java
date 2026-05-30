package NivelAvancado.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        ArrayList<Ninja> ninjas = new ArrayList<Ninja>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 26));
        ninjas.add(new Ninja("Kankuro", "Areia", 14));
        ninjas.add(new Ninja("Hiruzen Sarutobi", "Konoha", 69));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 20));
        ninjas.add(new Ninja("Killer Bee", "Nuvem", 35));
        ninjas.add(new Ninja("Gaara", "Areia", 12));
        ninjas.add(new Ninja("Temari", "Areia", 15));
        ninjas.add(new Ninja("Haku", "Nevoa", 15));
        ninjas.add(new Ninja("Zabuza Momochi", "Nevoa", 26));
        /*ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Nuvem"))
                .forEach(System.out::println);*/

        /*ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);*/

        /*ninjas.stream()
                .sorted((n1, n2) -> CharSequence.compare(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);*/

        /*ninjas.stream()
                .sorted((Comparator.comparing(Ninja::getNome).reversed()))
                .forEach(System.out::println);*/

        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .sorted((n1, n2) -> (CharSequence.compare(n1.getNome(), n2.getNome())))
                .map(Ninja::getNome)
                .forEach(System.out::println);

        //Teste Final com Streams
        List<String> ninjasList = ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .sorted(Comparator.comparing(Ninja::getNome).reversed())
                .map(Ninja::getNome)
                .toList();

        System.out.println(ninjasList);
    }
}
