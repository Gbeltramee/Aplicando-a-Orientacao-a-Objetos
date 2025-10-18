package Desafio02;

import java.awt.color.ProfileDataException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Atividade 1 - Verifica conta bancária
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.setTitular("Gabriel Beltrame");

        System.out.println("Nº da Conta: " + conta.getNumeroConta());
        System.out.println("Titular:     " + conta.getTitular());
        System.out.println("Saldo:       " + conta.getSaldo());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo Bancário: " + conta.getSaldo());

        System.out.println("\n");

        //Atividade 2 - Verifica se a pessoa é maior de idade
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Gabriel Beltrame");
        pessoa.setIdade(18);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.verificaMaiorIdade(pessoa.getIdade());

        System.out.println("\n");


        //Atividade 3 - Calcular preço final com desconto
        Produto produto = new Produto();

        produto.setNome("Bidog 15KG");
        produto.setPreco(43.50);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço Inicial: " + produto.getPreco());
        System.out.println("Preço com Desconto: " + produto.aplicarDesconto(10));

        System.out.println("\n");


        //Atividade 4 - Calcular média de notas de um aluno
        Aluno aluno = new Aluno();
        Scanner leitura = new Scanner(System.in);

        aluno.setNome("Gabriel Beltrame");
        aluno.setQuantidadeProvas(4);

        for (int i = 1; i < aluno.getquantidadeProvas()+1; i++) {
            System.out.println("Qual a nota da " + i + "º prova?");
            aluno.setNotas(leitura.nextDouble());
        }

        System.out.println("A nota média do aluno é: " + aluno.defineMedia());

        System.out.println("\n");


        //Atividade 5 - Salvar titulo e autor do livro e exibir essa informações
        Livro livro = new Livro();

        livro.setTitulo("O poder dos juros compostos");
        livro.setAutor("MAX EDITORIAL");

        livro.exibirDetalhes();
    }
}

