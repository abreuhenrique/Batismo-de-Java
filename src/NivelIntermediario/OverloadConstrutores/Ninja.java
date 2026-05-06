package NivelIntermediario.OverloadConstrutores;

public abstract class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir 2 novos Atributos - numeroDeMissoesConcluidas, Rank

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarregar o Construtor com os Novos Atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //Metodo Geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu Ataque Especial!");
    }

    public void apresentacao() {
        System.out.println("Meu nome é " + nome + " e eu já completei " + numeroDeMissoesConcluidas + " missões. Meu Nível Ninja é " + rank);
    }

    //Sobreescrevendo o Metodo da Interface
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + " Essa é minha estrategia de Combate!");
    }

    //Inteligencia de Combate - Metodo Padrão
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha INTELIGENCIA de combate");
    }

    //Inteligencia de Combate - Sobrecarregando o Metodo
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é " + qi + " e você é um genio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é " + qi + " e você precisa treinar mais sua estrategia!");
        }
    }

    public void metodoProvisorio() {
        System.out.println("Teste na Classe Ninja");
    }
}
