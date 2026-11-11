package br.com.alura.praticandojava.colecoesStreams.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionários: " + funcionarios);
    }
}
