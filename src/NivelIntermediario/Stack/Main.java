package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main(String[] args) {

        //Array:
        //Estatico e Possui Referencia de Memoria
        String[] nomeNinja = new String[3];
        nomeNinja[0] = "Naruto Uzumaki";

        //List
        //Dinamica e tamanho aumenta ou diminui conforme for preciso
        List<String> nomeNinjas = new ArrayList<>();
        nomeNinjas.add("Naruto Uzumaki");

        //Stack
        //Last In, First Out
        Stack<String> nomesNinja = new Stack<>();
        nomesNinja.push("Naruto Uzumaki");
        nomesNinja.push("Sasuke Uchiha");
        System.out.println("Stack Atual: " + nomesNinja);
        nomesNinja.push("Sakura Haruno");
        nomesNinja.push("Hinata Hyuga");
        nomesNinja.push("Kiba Inuzuka"); //Removido com o POP
        nomesNinja.pop();
        System.out.println("Stack Atualizada: " + nomesNinja);
        System.out.println("Elemento no Topo da Stack : " + nomesNinja.peek());
        System.out.println("A Stack está vazia? " + nomesNinja.isEmpty());
        System.out.println("Tamanho da Stack: " + nomesNinja.size());

    }
}
