package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    static void main(String[] args) {
        /*
        * Dados Nao Primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir metodos.
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println(nomeUpperCase);
        boolean nomeEmpty = nome.isEmpty();
        System.out.println("Nome vazio? " + nomeEmpty);

        String aldeia = "";
        boolean aldeiaEmpty = aldeia.isEmpty();
        System.out.println("Não está em uma Aldeia? " + aldeiaEmpty);
    }
}
