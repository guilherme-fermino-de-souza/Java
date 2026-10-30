package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio01;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno (String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void identificar () {
        System.out.printf("\nAluno: %s - Tipo: %s", nome, tipo);
    }
}
