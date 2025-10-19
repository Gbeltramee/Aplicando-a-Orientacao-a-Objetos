package Desafio03;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    public void cobrarTarifaMensal () {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrada. Saldo atual: " + saldo);
    }
}
