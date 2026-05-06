package NivelIntermediario.PolimorfismoAbstracao;

public class Main {
    static void main(String[] args) {

        //Obj naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //Obj sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";

        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        //Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", 27, "Aldeia da Folha");
        itachi.estrategiaDeBatalhaNinja();
        itachi.habilidadeEspecial();
    }
}
