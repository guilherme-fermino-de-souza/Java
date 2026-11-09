package br.com.alura.praticandojava.stringRegex.exercicio04;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = ler.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }
        ler.close();
    }
}
