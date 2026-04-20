package NivelBasico.Desafio02;

import java.util.Scanner;

public class CadastroDeNinjas {
    static void main(String[] args) {
        //Entrada de Dados
        Scanner scanner = new Scanner(System.in);

        //Array e Valor Maximo do Array
        int MAX_NINJAS = 10;
        String[] ninjas = new String[MAX_NINJAS];

        //Contadores
        int opcao = 0;
        int ninjasCadastrados = 0;

        while(opcao != 4){
            //MENU
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Deletar Ninja");
            System.out.println("3. Listar Ninjas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if(ninjasCadastrados < MAX_NINJAS) {
                        System.out.print("Digite o Nome do Nija: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com  Sucesso!");

                    } else {
                        System.out.println("A Lista está Cheia, impossível cadastrar um novo ninja");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum Ninja para ser Deletado");
                    } else {
                        System.out.println("Qual ninja você deseja Deletar? ");
                        int op = scanner.nextInt();
                        ninjas[op] = null;
                        ninjasCadastrados--;
                        System.out.println("Ninja Deletado com Sucesso!");
                    }
                    break;

                case 3:
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja foi Cadastrado");
                    } else {
                        System.out.println("---- Lista de Ninjas Cadastrados ----");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println("Ninja " + (i+1) + ": " + ninjas[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Estamos Encerrando o Programa...Aguarde");
                    break;

                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }
}
