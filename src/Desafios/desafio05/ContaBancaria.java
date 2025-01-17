package Desafios.desafio05;

public abstract class ContaBancaria implements Conta {

    Double saldo;

    public double consultarSaldo() {
        System.out.println("saldo é: " + saldo);
        return saldo;
    }

    public abstract void depositar(double valor);

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

}
