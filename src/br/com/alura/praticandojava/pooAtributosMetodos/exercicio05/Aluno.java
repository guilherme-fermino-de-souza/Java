package br.com.alura.praticandojava.pooAtributosMetodos.exercicio05;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    void calculaMedia() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.1f\n", nota1);
        System.out.printf("Nota 2: %.1f\n", nota2);
        System.out.printf("Média: %.1f\n", media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
