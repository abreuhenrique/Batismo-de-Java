package Practice.Collections;

import java.util.*;

public class DataStructure {
    static void main(String[] args) {

        System.out.println("========== Array ==========");
        //Static and have index
        String[] namesArray = new String[5];
        namesArray[0] = "Gargamel";
        namesArray[1] = "Minion";
        namesArray[2] = "Hamilton";

        System.out.println("Memory Reference: " + namesArray);
        for (String name : namesArray) {
            System.out.println(name);
        }

        System.out.println("========== Array List ==========");
        //Dynamic, have index, fast read, but write and delete slow
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(18);
        list.add(4);
        list.add(6);

        System.out.println(list.indexOf(3));

        System.out.println("========== Linked List ==========");
        //does not hava an index, nodes with value and memory reference of next element
        //Fast Write and Delete, but search is slow
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(2);

        System.out.println("========== Stack ==========");
        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        System.out.println("========== Queue ==========");
        //FIFO - Is an interface implemented by LinkedList, PriorityQueue,...
        Queue<String> brands = new LinkedList<>();
        brands.offer("Ford");
        brands.offer("Audi");
        brands.offer("MacLaren");
        brands.offer("Ford");
        System.out.println(brands);
        brands.poll();
        System.out.println(brands);

        System.out.println("========== Priority Queue ==========");
        //Priority in Natural Order
        PriorityQueue<String> fruits = new PriorityQueue<>();
        fruits.add("blueberry");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("kiwi");
        System.out.println(fruits);
        fruits.poll();
        System.out.println(fruits);

        System.out.println("========== HashSet ==========");
        //Does not accept duplicate elements, unpredictable order due to the hash table
        Set<String> users = new HashSet<>();
        users.add("John");
        users.add("Kick");
        users.add("Tony Stark");
        users.add("Tony Stark");
        System.out.println(users);

        System.out.println("========== TreeSet ==========");
        TreeSet<String> animals = new TreeSet<>();
        animals.addAll(users);
        System.out.println(animals);

        System.out.println("========== LinkedHashSet ==========");
        LinkedHashSet<String> musics = new LinkedHashSet<>();
        musics.add("Six Days");
        musics.add("Imagine");
        musics.add("Wellcome To The Jungle");
        System.out.println(musics);

        System.out.println("========== Map ==========");
        Map<String, String> names = new HashMap<>();
        names.put("First name", "Henrique");
        names.put("Surname", "Abreu");
        System.out.println(names);
    }
}
