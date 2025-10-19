package Desafio03;

public class Gato extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void atividadeFeita() {
        System.out.println("Arranhando Móveis");
    }
}
