package screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do FIlme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avaliaFilme(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double calculaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}