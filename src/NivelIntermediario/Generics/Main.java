package NivelIntermediario.Generics;

public class Main {
    static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.addFerramenta(new Kunai("Kunai Simpes"));
        bolsaNinja.addFerramenta(new Shuriken(5));
        bolsaNinja.addFerramenta(new Pergaminho("Invocação do Sapo"));

        System.out.println("Itens da Bolsa Ninja: ");
        bolsaNinja.mostrarFerramentas();

    }
}
