package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio04;

public class Principal {
    public static void main(String[] args) {
        Usuario user = new Usuario("123456");
        user.setSenha("123456", "abc123");
    }
}
