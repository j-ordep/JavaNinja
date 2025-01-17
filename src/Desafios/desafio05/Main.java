package Desafios.desafio05;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(2000.00);
        contaCorrente.consultarSaldo();
        contaCorrente.depositar(100.0);
        contaCorrente.consultarSaldo();




    }
}
