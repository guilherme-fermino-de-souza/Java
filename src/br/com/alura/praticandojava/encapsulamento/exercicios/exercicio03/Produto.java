package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio03;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido");
        } else {
            this.preco = preco;
        }
    }
}
