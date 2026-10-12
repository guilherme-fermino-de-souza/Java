package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new Contato("João Silva", "(11) 99999-0000"));
        contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos: ");
        int indice = 1;
        for (Contato c : contatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    c.getNome(),
                    c.getNumero());
        }
    }
}
