package br.com.alura.praticandojava.stringRegex.exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = ler.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        ler.close();
    }
}
