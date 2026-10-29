package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio02;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Julia", 16, 8.5);
        Aluno aluno02 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        aluno01.exibirDados();
        aluno02.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
