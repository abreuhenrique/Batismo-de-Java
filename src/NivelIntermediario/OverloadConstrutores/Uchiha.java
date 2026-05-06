package NivelIntermediario.OverloadConstrutores;

public class Uchiha extends Ninja {

    public Uchiha() {

    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //Overload na Subclasse
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    //FINAL METHODS
    /*
    * public void tacarKunai() {
        System.out.println("");
    }
    * */

    @Override
    public void habilidadeEspecial() {
        System.out.println("Esse é o meu Ataque Uchiha, um JUTSU BOLA DE FOGO!");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha INTELIGENCIA de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + " e você é um genio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é " + qi + " e você precisa treinar mais sua estrategia!");
        }
    }

    @Override
    public void metodoProvisorio() {
        System.out.println("Teste na Classe Uchiha");
    }
}
