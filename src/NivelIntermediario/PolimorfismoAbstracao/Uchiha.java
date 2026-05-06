package NivelIntermediario.PolimorfismoAbstracao;

public class Uchiha extends Ninja{

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um Jutsu Bola de Fogo");
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

}
