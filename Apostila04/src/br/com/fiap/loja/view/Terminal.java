package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Produto;
import br.com.fiap.loja.model.Fornecedor;
import java.util.Scanner;

public class Terminal {

    public static void main(String[]args) {
        // Criação da função de leitura de dados
        Scanner leitor = new Scanner(System.in);

        // Criar o novo objeto da classe fornecedor
        Fornecedor contato = new Fornecedor();

        // Ler as informações sobre o fornecedor
        System.out.println(
                "Qual é o CNPJ do fornecedor?"
        );
        String cnpj = leitor.nextLine();

        System.out.println(
                "Qual é o telefone do fornecedor?"
        );
        String telefone = leitor.nextLine();

        // Inserir as informações no objeto criado

        contato.cnpj = cnpj;
        contato.telefone = telefone;

        // Produto - Criação
        Produto camisa = new Produto();

        // Inserção dos valores
        System.out.println(
                "Qual é o código do produto?"
        );
        int codigo = leitor.nextInt();

        leitor.nextLine();

        System.out.println(
                "Qual é o nome do produto?"
        );
        String nome = leitor.nextLine();

        System.out.println(
                "Qual é o preço do produto?"
        );
        double preco = leitor.nextDouble();

        System.out.println(
                "O produto está disponível?"
        );
        boolean disponivel = leitor.nextBoolean();

        // Inserção dos valores nas variáveis do produto.

        camisa.codigo = codigo;
        camisa.nome = nome;
        camisa.preco = preco;
        camisa.disponivel = disponivel;
        camisa.fornecedor = contato;

        // Exibição dos dados:

        System.out.println(
                "CNPJ do fornecedor: " + camisa.fornecedor.cnpj
        );
        System.out.println(
                "Telefone do fornecedor: " + camisa.fornecedor.telefone
        );
        System.out.println(
                "Nome do produto: " + camisa.nome
        );
        System.out.println(
                "Código do produto: " + camisa.codigo
        );
        System.out.println(
                "Preço do produto: " + camisa.preco
        );
        System.out.println(
                "Está disponível? " + camisa.disponivel
        );


        double promocao = camisa.calcularDesconto();
        System.out.println(
                "Desconto: R$ " + promocao
        );

        System.out.println(
                "Qual a porcentagem de aumento?"
        );
        double porcentagem = leitor.nextDouble();

        camisa.aumentarPreco(porcentagem);

        System.out.println(
                "Novo preço: " + camisa.preco
        );

        // Criar um método para calcular o valor total da compra
        // Dado a quantidade, calcular o valor da compra

    }
}
