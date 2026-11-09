package br.com.alura.praticandojava.stringRegex.exercicio03;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = ler.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String palavraAntiga = ler.nextLine();

        if (!texto.contains(palavraAntiga)) {
            System.out.println("Palavra não encontrada.");
            ler.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String novaPalavra = ler.nextLine();

        String textoModificado = texto.replace(palavraAntiga, novaPalavra);
        System.out.println("Texto modificado: " + textoModificado);

        ler.close();
    }
}
