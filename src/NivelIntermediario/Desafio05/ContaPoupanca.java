package NivelIntermediario.Desafio05;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void consultarSaldo() {
        System.out.println("Valor na Conta R$ " + saldo);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01;
        System.out.println("Valor do Deposito: R$ " + valor);
        System.out.println("Valor da Taxa: R$ " + taxa);

        saldo += (valor - taxa);
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipoConta) {
        super(saldo, TipoConta.CONTA_POUPANCA);
    }
    public ContaPoupanca(double saldo, TipoConta tipoConta, String nome) {
        super(saldo, TipoConta.CONTA_POUPANCA, nome);
    }

}
