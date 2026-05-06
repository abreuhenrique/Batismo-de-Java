package NivelIntermediario.OverloadConstrutores;

public class Uzumaki extends Ninja {

   public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public void habilidadeEspecial() {
        System.out.println("E esse é o meu Ataque Uzumaki, um JUTSU MULTICLONES DAS SOMBRAS!");
    }
}
