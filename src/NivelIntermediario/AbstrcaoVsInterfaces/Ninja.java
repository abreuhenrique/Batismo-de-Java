package NivelIntermediario.AbstrcaoVsInterfaces;

public abstract class Ninja {

    String nome;
    int idade;
    String aldeia;

    public abstract void mostrarNome();

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai");
    }
}
