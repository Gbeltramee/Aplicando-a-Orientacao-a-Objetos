package Desafio03;

public class Principal {
    public static void main(String[] args) {
        //ATIVIDADE 01 - Definir maior, menor e a média de preço de um veículo
        Carro carro = new Carro();

        carro.definirModelo("Civic");
        carro.definirPrecos(150000, 145000, 200000);
        carro.exibirInformacoes();

        //ATIVIDADE 02 - Testando subclasses
        Gato gato = new Gato();

        gato.setNome("Gato");
        System.out.println(gato.getNome());
        gato.emitirSom();
        gato.atividadeFeita();

        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Cachorro");
        System.out.println(cachorro.getNome());
        cachorro.emitirSom();
        cachorro.atividadeFeita();

        //ATIVIDADE 03 - teste conta bancária

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(500);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(300);
        contaCorrente.consultarSaldo();
    }
}
