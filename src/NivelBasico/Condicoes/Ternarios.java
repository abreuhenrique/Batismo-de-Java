package NivelBasico.Condicoes;

public class Ternarios {
    static void main(String[] args) {
        /*
        * Ternario: Reduzir o numero de linhas no codigo
        * */

        short numeroDeMissoes = 10;
        String nivel = (numeroDeMissoes >= 10)? "Chunin":"Gennin";
        System.out.println(nivel);

    }
}
