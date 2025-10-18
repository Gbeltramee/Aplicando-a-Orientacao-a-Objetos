package Desafio01;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;
    double Media;

    void exibeFichaTecnica () {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lancamento: " + anoLancamento);
    }

    void avaliarMusica (double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculaMediaAvaliacoes (){
        return avaliacao / numAvaliacoes;
    }

}
