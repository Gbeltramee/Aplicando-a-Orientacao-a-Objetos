package Desafio03;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au au au!");;
    }

    @Override
    public void atividadeFeita() {
        System.out.println("Abanar rabo");
    }
}
