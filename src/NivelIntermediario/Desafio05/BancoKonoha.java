package NivelIntermediario.Desafio05;

public class BancoKonoha{

    public void transferir (ContaBancaria origem, ContaBancaria destino, double valor) {
        if(origem.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferencia Realizada no Valor de R$" + valor + " da Conta: " + origem.nomeUsuario + " para a Conta: " + destino.nomeUsuario);
        } else {
            System.out.println("Transação não pôde ser Concluída");
            System.out.println("Não foi possível trasferir o valor de R$ " + valor + " da Conta: " + origem.nomeUsuario + " para a Conta: " + destino.nomeUsuario);
        }
    }

}
