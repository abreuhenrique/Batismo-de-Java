package NivelBasico.Condicoes;

public class ifEElse {
    static void main(String[] args) {
        /*
        * if e else - Concicionais.
        * Objetivo: Passar o Status de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 16;

        if (numeroDeMissoes >= 100){
            System.out.println("Pronto para se tornar um HOKAGE!");
            rank = "HOKAGE";
        } else if(numeroDeMissoes >= 50){
            System.out.println("Pronto para se tornar um Jounin");
            rank = "Jounin";
        } else if(numeroDeMissoes >= 15){
            System.out.println("Pronto para se tornar um Chunin");
            rank = "Chunin";
        } else{
            System.out.println("Treine mais");
            rank = "Genin";
        }

        System.out.println("Status Atual do Ninja:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Rank: " + rank);
        System.out.println("HOKAGE: " + hokage);
    }
}
