public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do FIlme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avaliaFilme(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double calculaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }
}