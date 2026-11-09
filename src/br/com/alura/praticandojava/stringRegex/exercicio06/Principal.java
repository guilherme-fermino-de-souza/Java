package br.com.alura.praticandojava.stringRegex.exercicio06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        double valor = ler.nextDouble();

        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("Valor formatado: " + valorFormatado);
    }
}
