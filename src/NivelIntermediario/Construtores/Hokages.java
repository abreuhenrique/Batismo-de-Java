package NivelIntermediario.Construtores;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String especialidade;

    public abstract void mostrarEspecialidade();

    //All Args Constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    //No Args Constructor
    public Hokages() {

    }

}
