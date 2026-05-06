package NivelIntermediario.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
    }

    public void executarHabilidade() {
        System.out.println("Meu nome é " + ". E eu estou executando minha Habilidade: " + habilidade);
    }

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }
}
