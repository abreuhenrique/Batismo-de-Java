package NivelIntermediario.MetodosEAtributos;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Metodo VOID não retorna Valor
    public void AtivarSharingan() {
        System.out.println("Sharingan Ativado! Eu sou um Uchiha.");
    }

    //Metodo String que vai retornar uma String
    public String BoasVindas() {
        return "Bom dia! Eu sou um Ninja";
    }

    //Metodo int com Parametro
    public int TempoParaSerHokage(int idadeMinima) {
        return idadeMinima - idade;
    }
}
