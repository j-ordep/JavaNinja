package Desafios.desafio05;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void depositar(double valorDepositado) {
        double taxa = 0.01;
        this.saldo += valorDepositado - (valorDepositado * taxa); // Atualiza o saldo diretamente, diferente da implementação na class ContaPoupanca
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }
}
