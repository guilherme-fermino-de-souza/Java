package br.com.alura.praticandojava.pooAtributosMetodos.exercicio10;

public class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        return preco * quantidade;
    }
}
