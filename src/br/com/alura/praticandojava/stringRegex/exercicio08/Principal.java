package br.com.alura.praticandojava.stringRegex.exercicio08;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = ler.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}.\\d{3}.\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) {
            System.out.printf("O CPF %s está no formato válido.", cpf);
        } else {
            System.out.printf("O CPF %s é inválido", cpf);
        }
        ler.close();
    }
}
