package SolandoQuestoes;

import java.util.Scanner;

public class MediaSalarial {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Grade Salarial dos Funcionarios -----");
        double salarios[] = new double[10];
        double average = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o Salario do funcionario 0" + (i + 1) + ": ");
            salarios[i] = scanner.nextInt();

            average += salarios[i];
        }

        average /= 10;
        System.out.println("A media Salarial da Empresa é: R$" + average);

        scanner.close();
    }
}
