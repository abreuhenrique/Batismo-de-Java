package NivelIntermediario.Generics;

public class FerramentasNinjas {

    String nome;

    FerramentasNinjas() {
    }

    FerramentasNinjas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

}
