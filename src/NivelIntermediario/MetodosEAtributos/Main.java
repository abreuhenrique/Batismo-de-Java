package NivelIntermediario.MetodosEAtributos;

public class Main {
    static void main(String[] args) {

        /*
        *
        String nomeN = "Naruto Uzumaki";
        String aldeiaN = "Konoha";
        int idadeN = 17;
        System.out.println(nomeN);

        String nomeS = "Sasuke Uchiha";
        String aldeiaS = "Konoha";
        int idadeS = 17;
        System.out.println(nomeS);
        *
        * */

        //Objeto 1
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;

        int quantoTempo = Naruto.TempoParaSerHokage(60);
        System.out.println("Você possui " + Naruto.idade + " anos faltam " + quantoTempo + " anos para se Tornar um Hokage");

        //Objeto 2
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 18;

        //Atribuindo Metodos aos Objetos
        Sasuke.AtivarSharingan();

        //Objeto 3
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 18;
        String mostraMetodo = Sakura.BoasVindas();
        System.out.println(mostraMetodo);
    }
}