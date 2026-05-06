package NivelIntermediario.Encapsulamento;

public class Main {
    static void main(String[] args) {

        System.out.println("-------------------- Naruto Uzumaki --------------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 18, 20, 1.65);
        /*naruto.nome = "Naruto Uzumaki";*/
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Nome: " + naruto.getNome());

        System.out.println("-------------------- Sasuke Uchiha --------------------");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da Folha", 16, 14, 1.68);
        System.out.println("Nome: " + sasuke.getNome());
        sasuke.setNome("Sasuke Uchiha");
        System.out.println("Nome Alterado: " + sasuke.getNome());

    }
}
