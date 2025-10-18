package Desafio01;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibeOlaMundo();



        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dobraValorRecebido(10);
        System.out.println(resultado);



        Musica musica = new Musica();
        musica.titulo = "Esse cara sou eu";
        musica.artista = "Roberto Carlos";
        musica.anoLancamento = 2012;

        musica.exibeFichaTecnica();
        musica.avaliarMusica(10);
        musica.avaliarMusica(5);
        musica.avaliarMusica(2);

        System.out.println("Média de Avaliação: " + musica.calculaMediaAvaliacoes());



        Carro carro = new Carro();

        carro.modelo = "Civic";
        carro.ano = 2019;
        carro.cor = "Preto";

        carro.exibeFichaTecnica();
        System.out.println("A idade do carro é: " + carro.calculaIdadeCarro() + "anos");
    }


}
