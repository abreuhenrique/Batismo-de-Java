package NivelIntermediario.Generics;

public class Main {
    static void main(String[] args) {
        FerramentasNinjas kunai = new FerramentasNinjas("Kunai Simples");
        FerramentasNinjas shuriken = new FerramentasNinjas("Shuriken");

        BolsaGenerica bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.addFerramentas(kunai);
        bolsaGenerica.addFerramentas(shuriken);

        System.out.println(bolsaGenerica);
    }
}
