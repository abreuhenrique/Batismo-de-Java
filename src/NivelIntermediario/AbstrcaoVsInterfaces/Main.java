package NivelIntermediario.AbstrcaoVsInterfaces;

public class Main {
    static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        /*naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";*/

        naruto.tacarShuriken();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        sasuke.tacarKunai();

    }
}
