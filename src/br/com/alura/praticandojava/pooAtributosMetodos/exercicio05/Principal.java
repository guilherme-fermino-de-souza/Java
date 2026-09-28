package br.com.alura.praticandojava.pooAtributosMetodos.exercicio05;

public class Principal {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "João Silva";
        a.nota1 = 6.5;
        a.nota2 = 7.5;

        a.calculaMedia();
    }
}
