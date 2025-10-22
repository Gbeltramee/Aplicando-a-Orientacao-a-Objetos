import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Velozes e Furiosos");
        meuFilme.setAnoDeLancamento(2013);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliação:  " + meuFilme.calculaMedia());


        Serie serie = new Serie();
        serie.setNome("Dexter");
        serie.setAnoDeLancamento(2005);
        serie.exibeFichaTecnica();
        serie.setTemporadas(8);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(55);

        System.out.println("Duração da serie " + serie.getNome() + ": " + serie.getDuracaoEmMinutos() + " minutos");


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.adicionaTempoTotal(meuFilme);
        calculadora.adicionaTempoTotal(serie);
        System.out.println(calculadora.getTempototal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.Filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.Filtra(episodio);

    }
}