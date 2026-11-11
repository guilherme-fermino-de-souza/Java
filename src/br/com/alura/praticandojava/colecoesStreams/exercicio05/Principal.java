package br.com.alura.praticandojava.colecoesStreams.exercicio05;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Ana");
        clientes.put(2, "Marcos");
        clientes.put(3, "Pedro");

        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }
}
