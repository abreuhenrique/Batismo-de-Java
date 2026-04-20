package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    static void main(String[] args) {

        /*
        * Scanner: caixas de texto para receber dados/mensagens do usuario
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome do Ninja: ");
        String nomeNinja = scanner.nextLine();
        System.out.println("O nome do Ninja é: " + nomeNinja);

        System.out.println("Digite a idade do ninja: ");
        int idadeNinja = scanner.nextInt();
        System.out.println("A idade do ninja é: " + idadeNinja + " anos");
        if(idadeNinja >= 18) {
            System.out.println("O ninja " + nomeNinja + " é maior de idade.");
        } else {
            System.out.println("O ninja e menor de idade");
        }

        scanner.close();

    }
}
