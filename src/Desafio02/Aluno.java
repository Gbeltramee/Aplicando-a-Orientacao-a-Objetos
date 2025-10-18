package Desafio02;

public class Aluno {
    private String nome;
    private double notas;
    private int quantidadeProvas;

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public int getquantidadeProvas() {
        return quantidadeProvas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNotas(double nota) {
        this.notas += nota;
    }

    public void setQuantidadeProvas(int provas) {
        quantidadeProvas = provas;
    }

    public double defineMedia (){
        return notas / quantidadeProvas;
    }

}
