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
        while(opcao != 5) {
            System.out.println("---------------MENU---------------");
            System.out.println("1. Adicionar Um Ninja");
            System.out.println("2. Remover Um Ninja");
            System.out.println("3. Consultar Um Ninja");
            System.out.println("4. Visualizar A Lista");
            System.out.println("5. Sair");
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
                case 2:
                    System.out.println("Buscar Por:");
                    System.out.println("1.Index");
                    System.out.println("2.Nome");
                    System.out.print("Opção: ");
                    int op = scanner.nextInt();
                    scanner.nextLine();
                    if (op == 1) {
                        System.out.print("Index do Ninja: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        list.removeNinjaIndex(index);
                        System.out.println("Ninja Removido!");
                    } else if (op == 2) {
                        System.out.println("Nome do Ninja: ");
                        String nomeNinja = scanner.nextLine();

                        list.removeNinjaName(nomeNinja);
                        System.out.println("Ninja Removido!");
                    }
                    break;
                case 3:
                    System.out.println("Buscar Por:");
                    System.out.println("1. Nome");
                    System.out.println("2. Index");
                    System.out.println("3. Aldeia");
                    System.out.println("4. Idade");
                    System.out.print("Opção: ");
                    op = scanner.nextInt();
                    scanner.nextLine();

                    switch (op) {
                        case 1:
                            System.out.println("Nome do Ninja: ");
                            String nomeNinja = scanner.nextLine();

                            break;
                        case 2:
                            System.out.print("Index do Ninja: ");
                            int index = scanner.nextInt();
                            scanner.nextLine();

                            list.mostrarNinjaIndex(index);
                            break;
                        case 3:
                            System.out.println("Aldeia do Ninja: ");
                            String aldeiaDoNinja = scanner.nextLine();

                            break;
                        case 4:
                            System.out.print("Idade do Ninja: ");
                            int idadeDoNinja = scanner.nextInt();
                            scanner.nextLine();

                    }
                    break;
                case 4:
                    System.out.println("---------------Lista de Ninjas---------------");
                    list.mostraLista();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
            }
        }

    }
}
