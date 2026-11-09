package br.com.alura.praticandojava.stringRegex.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = ler.nextLine();

        String maiusculas = texto.toUpperCase();
        String minusculas = texto.toLowerCase();

        System.out.println("Texto em maiúsculas: " + maiusculas);
        System.out.println("Texto em minúsculas: " + minusculas);
        ler.close();
    }
}
