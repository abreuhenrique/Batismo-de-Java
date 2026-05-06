package NivelIntermediario.OverloadConstrutores;

public class Main {
    public static void main(String[] args) {

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 15, 23, NivelNinja.GENIN);
        naruto.apresentacao();
        naruto.habilidadeEspecial();

        //Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16, 15, NivelNinja.GENIN);
        sasuke.apresentacao();
        sasuke.habilidadeEspecial();

        //Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 28, 50, NivelNinja.JOUNIN);
        itachi.apresentacao();
        itachi.habilidadeEspecial();
        // Metodo Comum
        itachi.inteligenciaDeCombate();
        // Metodo Sobrecarregado
        itachi.inteligenciaDeCombate(170);

    }
}
