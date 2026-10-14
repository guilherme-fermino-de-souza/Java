package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio08;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Usuario aluno = new Usuario("aluno2025", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("Digite o seu usuário: ");
            String usuario = leitura.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = leitura.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        leitura.close();
    }
}
