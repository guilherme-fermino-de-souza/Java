package br.com.alura.praticandojava.pooAtributosMetodos.exercicio08;

public class Item {
    String nome;
    int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    void vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.printf("Venda realizada. Estoque restante de %s: %d%n", nome, this.quantidade);
        } else {
            System.out.println("Estoque insuficiente");
        }
    }
}
