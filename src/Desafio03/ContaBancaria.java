package Desafio03;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo atual: " + saldo);
    }

    public void sacar (double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }

}
