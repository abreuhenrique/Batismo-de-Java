package NivelIntermediario.Desafio06;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int count = 8;

        //Criando Ninjas Iniciais
        Ninja n001 = new Ninja("Naruto Uzumaki", "Aldeia da Folha", 12);
        Ninja n002 = new Ninja("Sasuke Uchiha", "Aldeia da Folha", 13);
        Ninja n003 = new Ninja("Sakura Haruno", "Aldeia da Folha", 13);
        Ninja n004 = new Ninja("Kakashi Hatake", "Aldeia da Folha", 24);
        Ninja n005 = new Ninja("Hinata Hyuga", "Aldeia da Folha", 12);
        Ninja n006 = new Ninja("Hiruzen Sarutobi", "Aldeia da Folha", 60);
        Ninja n007 = new Ninja("Shikamaru Nara", "Aldeia da Folha", 12);

        //Adicionando Ninjas na Lista
        LinkedList<Object> ninjasList = new LinkedList<>();
        ninjasList.add(n001);
        ninjasList.add(n002);
        ninjasList.add(n003);
        ninjasList.add(n004);
        ninjasList.add(n005);
        ninjasList.add(n006);
        ninjasList.add(n007);

        while(opcao != 5){
            //MENU
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Remover Ninja");
            System.out.println("3. Exibir Lista");
            System.out.println("4. Consultar Ninja Especifico");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int posicao;
                    System.out.println("Posição do Ninja: ");
                    System.out.println("1. Inicio");
                    System.out.println("2. Final");
                    System.out.print("Opção: ");
                    posicao = scanner.nextInt();

                    Ninja n00count = new Ninja();
                    System.out.print("Nome do Ninja: ");
                    scanner.nextLine();
                    n00count.setNome(scanner.nextLine());
                    System.out.print("Aldeia do Ninja: ");
                    n00count.setAldeia(scanner.nextLine());
                    System.out.print("Idade do Ninja: ");
                    n00count.setIdade(scanner.nextInt());

                    if(posicao == 1) {
                        ninjasList.addFirst(n00count);
                    }
                    else if(posicao == 2) {
                        ninjasList.addLast(n00count);
                    }
                    else {
                        System.out.println("Posição Inválida!");
                    }

                    count++;
                    break;

                case 2:
                    System.out.println("Ninja: " + ninjasList.removeLast() + " removido.");
                    break;
                case 3:
                    System.out.println("---------------------------Ninjas---------------------------");
                    for (int i = 0; i < ninjasList.size(); i++) {
                        System.out.println(ninjasList.get(i));
                    }
                    break;
                case 4:
                    int op = 0;
                    System.out.println("Buscar Por: ");
                    System.out.println("1. Posição:");
                    System.out.println("2. Nome:");
                    System.out.println("3. Aldeia:");
                    System.out.println("4. Idade:");
                    System.out.print("Opção: ");
                    op = scanner.nextInt();

                    if(op == 1) {
                        System.out.print("Posição do Ninja: ");
                    }

                    System.out.println(ninjasList.get(scanner.nextInt()));
                    break;
                case 5:
                    System.out.println("Finalizando Programa...");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }

    }
}
