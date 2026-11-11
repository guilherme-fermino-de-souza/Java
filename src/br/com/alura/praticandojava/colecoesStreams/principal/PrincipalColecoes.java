package br.com.alura.praticandojava.colecoesStreams.principal;

import java.util.*;

public class PrincipalColecoes {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Abner");
        funcionarios.add("Bruno");
        funcionarios.add("Abner");

        System.out.println(funcionarios);

        Set<String> produtos = new HashSet<>();
        produtos.add("Adoçante");
        produtos.add("Bolacha");

        System.out.println(produtos);

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Pluto");
        clientes.put(2, "Miles");
        clientes.put(3, "Peter");

        System.out.println(clientes.get(2));
    }
}
