package Desafios.desafio05;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void depositar(double valorDepositado) {
        double taxa = 0.20;
        double valorDepositadoComTaxa = valorDepositado - (valorDepositado * taxa);
        this.saldo += valorDepositadoComTaxa;
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

}
