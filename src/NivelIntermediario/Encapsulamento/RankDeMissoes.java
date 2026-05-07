package NivelIntermediario.Encapsulamento;

public enum RankDeMissoes {
    D("Muito Facil", 2),
    C("Facil", 4),
    B("Tranquilo", 6),
    A("Dificil", 8),
    S("Muito Dificil", 10);

    String descricao;
    int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
