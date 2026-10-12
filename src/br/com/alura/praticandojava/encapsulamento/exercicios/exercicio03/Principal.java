package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio03;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Mouse");
        p.setPreco(-59.90);

        System.out.printf("Produto: %s \nPreço: %.2f", p.getNome(), p.getPreco());
    }
}
