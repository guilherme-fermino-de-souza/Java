package br.com.alura.praticandojava.pooAtributosMetodos.exercicio01;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void relatorioProduto() {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
