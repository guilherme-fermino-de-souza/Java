package br.com.alura.praticandojava.colecoesStreams.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Joana");
        estudantes.add("Lucas");
        estudantes.add("Pedro");
        estudantes.add("Antônio");

        System.out.println("Lista inicial: " + estudantes);

        estudantes.remove("Pedro");

        System.out.println("Lista após a exclusão: " + estudantes);
    }
}
