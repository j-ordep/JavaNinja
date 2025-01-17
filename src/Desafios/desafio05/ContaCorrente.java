package Desafios.desafio05;

public class ContaCorrente extends ContaBancaria {

    public double consultarSaldo() {
        System.out.println("saldo é: " + saldo);
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        double taxa = 0.01; // faz o L
        this.saldo += valor - (valor * taxa); // Atualiza o saldo diretamente, diferente da implementação na class ContaPoupanca
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }
}
