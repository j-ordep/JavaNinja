package Desafios.desafio05;

public abstract class ContaBancaria implements Conta {

    Double saldo;

    @Override
    public double consultarSaldo() {
        System.out.println("saldo é: " + saldo);
        return saldo;
    }

    public abstract void depositar(double valor);

    // Para as subclasses terem acesso ao saldo
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }



}
