package br.com.fiap.loja.model;

public class Produto {

    // Public serve para fazer com que os itens listados possam ser utilizados em classes de outras oastas.
    public double preco;
    public int codigo;
    public String nome;
    public boolean disponivel;
    public Fornecedor fornecedor;

    // Métodos
    public double calcularDesconto(){
        double desconto = preco * 0.2;
        return desconto;
    }

    public void aumentarPreco(double porcentagem){
        preco += preco * porcentagem /100;
    }
}
