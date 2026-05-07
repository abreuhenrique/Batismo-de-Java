package NivelIntermediario.Encapsulamento;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes() {
        System.out.println("Missão: " + nome);
        System.out.println("Rank: " + rank);
        System.out.println("(" + rank.getDescricao() + ": " + rank.getDificuldade() + ")");
    }

    public Missoes() {

    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
