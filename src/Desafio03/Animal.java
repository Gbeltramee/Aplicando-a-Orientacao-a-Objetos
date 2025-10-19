package Desafio03;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Fazendo barulho!");
    }

    public void atividadeFeita() {
        System.out.println("Nenhuma atividade feita");
    }
}
