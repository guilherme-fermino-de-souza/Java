package br.com.alura.praticandojava.stringRegex.exercicio10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String senha = ler.nextLine();

        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (senha.matches(regex)) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha é inválida!.");
        }
        ler.close();
    }
}
