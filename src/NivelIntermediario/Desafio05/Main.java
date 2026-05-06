package NivelIntermediario.Desafio05;

public class Main {
    static void main(String[] args) {
        //Instanciando um Objeto da Classe Banco
        BancoKonoha banco = new BancoKonoha();

        //Instanciando ContaCorrente
        ContaBancaria naruto = new ContaCorrente(10, TipoConta.CONTA_CORRENTE, "Naruto Uzumaki");
        //Instanciando ContaPoupanca
        ContaBancaria kakashi = new ContaPoupanca(200, TipoConta.CONTA_CORRENTE, "Kakashi Hatake");

        kakashi.depositar(20);
        kakashi.consultarSaldo();

        banco.transferir(kakashi, naruto, 20);
        naruto.consultarSaldo();

        banco.transferir(naruto, kakashi, 200);

    }
}
