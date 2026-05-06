package NivelIntermediario.Desafio04;

public class Main {
    static void main(String[] args) {

        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 9, "Jutsu Haren");
        NinjaBasico sakura = new NinjaBasico("Sakura Haruno", 10, "Controle de Chakara");
        NinjaAvancado sasuke = new NinjaAvancado("Sasuke Uchiha", 10, "Combate", "Jutsu Bola de Fogo");

        naruto.executarHabilidade();
        naruto.mostrarInformacoes();
        sakura.mostrarInformacoes();
        sasuke.mostrarInformacoes();
    }
}
