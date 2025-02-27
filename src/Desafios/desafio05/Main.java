package Desafios.desafio05;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(2000.00);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(100.0);
        contaCorrente.consultarSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(5000.00);
        contaPoupanca.consultarSaldo();
        contaPoupanca.depositar(100.0);
        contaPoupanca.saldo = 1000.0;
        contaPoupanca.consultarSaldo();




    }
}
