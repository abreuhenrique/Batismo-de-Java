package NivelIntermediario.Desafio05;

public abstract class ContaBancaria implements Conta{

    //Atributos
    public String nomeUsuario;
    public double saldo;
    public TipoConta tipoConta;

    //Implementando Metodos da Interface Conta
    @Override
    public void consultarSaldo() {
        System.out.println("Valor na Conta R$ " + saldo);
    }

    @Override
    public abstract void depositar(double valor);

    @Override
    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente");
            return false;
        }
    }

    //Construtores
    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Overload do Construtor
    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;

    }
    public ContaBancaria(double saldo, TipoConta tipoConta, String nomeUsuario) {
        this(saldo, tipoConta);
        this.nomeUsuario = nomeUsuario;
    }
}
