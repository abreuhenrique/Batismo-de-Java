package NivelIntermediario.PolimorfismoAbstracao;

public class Ninja implements EstrategiaNinja{

    String nome;
    int idade;
    String aldeia;

    //Metodo Geral - Todos os Ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    //Metodo Abstrado Será Obrigatório em todas as Classes


    //Override porque estou sobreescrevendo o metodo da Interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha Estratégia de Batalha");
    }

    public Ninja() {

    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }
}
