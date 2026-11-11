package br.com.alura.praticandojava.colecoesStreams.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.printf("A segunda pessoa da lista é : %s\nTotal de funcionários: %d",
                funcionarios.get(1), funcionarios.size());
    }
}
