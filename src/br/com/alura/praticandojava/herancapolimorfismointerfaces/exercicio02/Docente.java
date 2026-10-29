package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio02;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("\nDocente: %s - Idade: %d - Disciplina: %s",
                nome, idade, disciplina);
    }
}