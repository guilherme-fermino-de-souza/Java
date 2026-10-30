package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio01;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}
