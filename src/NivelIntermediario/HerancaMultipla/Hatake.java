package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void apresentacao() {
        System.out.println("Meu nome é " + nome + " e eu sou um Hatake!");
    }

    public void sharinganAtivado() {
        System.out.println(nome + " Ativou o Sharingan!");
    }

    public void ninjaDeElite() {
        System.out.println("Meu nome é " + nome + " e eu também sou um Ninja de Elite da ANBU!");
    }

    public void hokageAtivo() {
        System.out.println("Meu nome é " + nome + " e agora eu sou um Hokage!");
    }
}
