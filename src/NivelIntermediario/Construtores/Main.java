package NivelIntermediario.Construtores;

public class Main {

    static void main(String[] args) {
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        System.out.println(Hashirama.nome);

        Senju Tobirama = new Senju();
        Tobirama.nome = "Tobirama Senju";
        Tobirama.idade = 45;
        Tobirama.vivoOuNao = false;
        Tobirama.especialidade = "Edo Tensei";

        System.out.println(Tobirama.nome);
        System.out.println(Tobirama.idade);
        System.out.println(Tobirama.vivoOuNao);
        Tobirama.mostrarEspecialidade();
    }
}
