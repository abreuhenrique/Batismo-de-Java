package NivelBasico.TiposDeDados;

public class DadosPrimitivos {
    static void main(String[] args) {
        /*
        * Dados Primitivos - int, double, float, char, boolean, short.
        * Criar um Ninja
        *
        * */

        int idade = 16; //Valor Máximo: 2.147.483.647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999999L; //Valor Máximo: 9.223.372.036.854.775.807.

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println(inicial);
        System.out.println("Vivo? " + vivoOuMorto);
    }

}
