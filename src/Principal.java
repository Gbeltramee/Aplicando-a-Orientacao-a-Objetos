public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Velozes e Furiosos";
        meuFilme.anoDeLancamento = 2013;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.calculaMedia());
    }
}