package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {
        /*
        * Switch Case: Serve para gerar casos especificos
        *
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        System.out.print("Escolha um Ninja: ");
        int escolhaUsuario = scanner.nextInt();

        System.out.println("Você digitou: " + escolhaUsuario);

        switch (escolhaUsuario){
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki, o próximo HOKAGE!");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha, o ninja mais revoltado!");
                break;
            case 3:
                System.out.println("O usuario escolheu Sakura Haruno, a ninja mais legal!");
                break;
            default:
                System.out.println("O usuario digitou uma resposta invalida!");
        }

        scanner.close();
    }
}
