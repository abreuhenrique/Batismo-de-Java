package NivelIntermediario.Desafio06;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NinjasList list = new NinjasList();
        list.addNinja("Naruto Uzumaki", "Folha", 12);
        list.addNinja("Sakura Haruno", "Folha", 13);
        list.addNinja("Sasuke Uchiha", "Folha", 13);
        list.addNinja("Kakashi Hatake", "Folha", 24);
        list.addNinja("Hiruzen Sarutobi", "Folha", 60);
        list.addNinja("Itachi Uchiha", "Folha", 23);
        list.addNinja("Kisame Hoshigaki", "Névoa", 29);

        int opcao = 0;
        while(opcao != 6) {
            System.out.println("---------------MENU---------------");
            System.out.println("1. Adicionar Um Ninja");
            System.out.println("2. Remover Um Ninja");
            System.out.println("3. Consultar Um Ninja");
            System.out.println("4. Visualizar A Lista");
            System.out.println("5. Ordenar A Lista");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Ninja: ");
                    String nome = scanner.nextLine();
                    System.out.print("Aldeia do Ninja: ");
                    String aldeia = scanner.nextLine();
                    System.out.print("Idade do Ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    list.addNinja(nome, aldeia, idade);
                    break;
            }
        }

    }
}
