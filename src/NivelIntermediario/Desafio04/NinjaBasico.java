package NivelIntermediario.Desafio04;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + ". E eu estou executando minha Habilidade: " + habilidade);
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
