package NivelIntermediario.Generics;

public class Shuriken {
    private int quantidade;

    public Shuriken (int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return quantidade + " Shuriken(s)";
    }
}
