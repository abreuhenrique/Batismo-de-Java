package NivelIntermediario.Desafio01;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        //Scanner e Variavel de Opcao do Switch para o Menu Principal
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        //Array Uchiha
        String[] uchiha = new String[5];
        String[] ninja = new String[5];

        //Contador do Numero Uchihas já Cadastrados e o maximo de Uchihas que podem ser cadastrados
        int uchihasCadastrados = 0;
        int maxUchihas = 5;

        //Contador do Numero de Ninjas já Cadastrados e o Maximo que podem ser Cadastrados
        int ninjasCadastrados = 0;
        int maxNinjas = 5;

        while(opcao != 4){
            //Menu Principal
            System.out.println("---------- MENU DE NINJAS ----------");
            System.out.println("1. Adicionar Ninja");
            System.out.println("2. Mostrar Informações dos Ninjas");
            System.out.println("3. Atualizar Habilidade Especial");
            System.out.println("4. Sair");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    int cla;
                    System.out.println("Escolha o Clã: ");
                    System.out.println("1. Uchiha");
                    System.out.println("2. Sem Clã");
                    System.out.print("Escolha: ");
                    cla = scanner.nextInt();
                    scanner.nextLine();

                    switch (cla) {
                        case 1:
                            if(uchihasCadastrados < maxUchihas) {

                                //Instanciando um Objeto da Classe Uchiha
                                Uchiha n_uchihasCadastrados = new Uchiha();

                                //Adicionando Valores aos Atributos da Classe
                                System.out.print("Nome: ");
                                n_uchihasCadastrados.nome = scanner.nextLine();
                                uchiha[uchihasCadastrados] = n_uchihasCadastrados.nome;

                                System.out.print("Idade: ");
                                n_uchihasCadastrados.idade = scanner.nextInt();
                                scanner.nextLine();

                                System.out.print("Missão: ");
                                n_uchihasCadastrados.missao = scanner.nextLine();

                                System.out.print("Dificuldade: ");
                                n_uchihasCadastrados.nivelDificuldade = scanner.nextLine();

                                System.out.print("Status da Missão: ");
                                n_uchihasCadastrados.statusMissao = scanner.nextLine();

                                uchihasCadastrados ++;
                            }
                            break;

                        case 2:
                            if (ninjasCadastrados < maxNinjas) {
                                    //Instanciando Um Objeto da Classe Ninja
                                    Ninja n_ninjasCadastrados = new Ninja();

                                    //Adicionando Valores
                                    System.out.print("Nome: ");
                                    n_ninjasCadastrados.nome = scanner.nextLine();
                                    ninja[ninjasCadastrados] = n_ninjasCadastrados.nome;

                                    System.out.print("Idade: ");
                                    n_ninjasCadastrados.idade = scanner.nextInt();
                                    scanner.nextLine();

                                    System.out.print("Missão: ");
                                    n_ninjasCadastrados.missao = scanner.nextLine();

                                    System.out.print("Dificuldade: ");
                                    n_ninjasCadastrados.nivelDificuldade = scanner.nextLine();

                                    System.out.print("Status da Missão: ");
                                    n_ninjasCadastrados.statusMissao = scanner.nextLine();

                                    ninjasCadastrados ++;

                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("---------- Ninjas Cadastrados ----------");

                    //Mostrando todos os Uchihas Cadastrados
                    System.out.println("UCHIHAS:");
                    if(uchihasCadastrados != 0) {
                        for (int i = 0; i < uchihasCadastrados; i++) {
                            System.out.println("Uchiha: " + uchiha[i]);
                        }
                    } else{
                        System.out.println("Nenhum Uchiha foi Cadastrado.");
                    }

                    //Mostrando os Ninjas não Uchihas Cadastrados
                    System.out.println("NINJAS:");
                    if(ninjasCadastrados != 0) {
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println("Ninja: " + ninja[i]);
                        }
                    } else {
                        System.out.println("Nenhum Ninja foi Cadastrado.");
                    }
                    break;

                case 3:
                    System.out.println("---------- Habilidade Especial ----------");
                    if (uchihasCadastrados != 0) {
                        for (int i = 0; i < uchihasCadastrados; i++) {
                            System.out.println((i+1) + "- " + uchiha[i]);
                        }
                        System.out.println(" ");
                        System.out.print("Em qual Ninja Você deseja Adicionar uma Habilidade Especial? ");
                        int op = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Habilidade Especial:");
                        uchiha[op+1] = scanner.nextLine();
                    }
            }
        }

    }
}