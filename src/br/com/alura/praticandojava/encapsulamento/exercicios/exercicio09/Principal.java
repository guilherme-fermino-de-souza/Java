package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio09;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
