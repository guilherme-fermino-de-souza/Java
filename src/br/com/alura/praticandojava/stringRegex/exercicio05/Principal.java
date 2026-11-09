package br.com.alura.praticandojava.stringRegex.exercicio05;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = ler.nextLine();

        System.out.println("Digite a palavra: ");
        String palavra = ler.nextLine();

        if (texto.contains(palavra)) {
            System.out.printf("A palavra \"%s\" está presenta no texto.", palavra);
        } else {
            System.out.printf("A palavra \"%s\" não está presenta no texto.", palavra);
        }

        ler.close();
    }
}
