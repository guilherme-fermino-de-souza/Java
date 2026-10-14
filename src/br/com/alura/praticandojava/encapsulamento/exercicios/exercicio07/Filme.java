package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio07;

import java.util.ArrayList;

public class Filme {
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAvaliacao(int nota) {
        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5.");
        } else {
            avaliacoes.add(nota);
        }
    }

    public double calcularMedia() {
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
