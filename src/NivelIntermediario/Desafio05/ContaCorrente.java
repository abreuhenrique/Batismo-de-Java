package NivelIntermediario.Desafio05;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Valor na Conta R$ " + saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Valor Depositado na Conta: " + valor);
        saldo += valor;
        System.out.println("Saldo Atual: " + saldo);
    }

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    //Overload do Construtor na SubClasse
    public ContaCorrente(double saldo, TipoConta tipoConta) {
        super(saldo, TipoConta.CONTA_CORRENTE);
    }
    public ContaCorrente(double saldo, TipoConta tipoConta, String nome) {
        super(saldo, TipoConta.CONTA_CORRENTE, nome);
    }
}
