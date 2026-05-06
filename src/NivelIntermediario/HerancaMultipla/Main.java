package NivelIntermediario.HerancaMultipla;

public class Main {
    static void main(String[] args) {

        //Obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        //Obj Hatake
        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 31;
        kakashi.apresentacao();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();

    }

}
