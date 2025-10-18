import screenmatch.modelos.Filme;

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
    }
}