package br.com.alura.praticandojava.pooAtributosMetodos.exercicio01;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "Mouse Gamer";
        p.preco = 159.9;
        p.quantidade = 25;

        p.relatorioProduto();
    }
}
