package Desafios.desafio05;

public class ContaPoupanca extends ContaBancaria {

    public double consultarSaldo() {
        System.out.println("saldo é: " + saldo);
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        double taxa = 0.20;
        double valorDepositado = valor;
        double valorDepositadoComTaxa = valorDepositado - (valor * taxa); // guarda o valor com taxa - faz o L
        this.saldo += valorDepositadoComTaxa; // this.saldo = saldo + valorDepositadoComTaxa;
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
}
