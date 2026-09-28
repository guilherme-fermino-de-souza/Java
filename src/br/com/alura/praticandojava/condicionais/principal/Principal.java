package br.com.alura.praticandojava.condicionais.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // exercicio 10 ---
        String codigoCorreto = "2023";
        System.out.println("Digite o código de acesso: ");
        String codigoAcesso = leitura.nextLine();
        System.out.println("Digite o nível de permissão: ");
        int nivelPermissao = leitura.nextInt();

        boolean codigoAcessoValido = codigoAcesso.equals(codigoCorreto);
        boolean nivelPermissaoValido = nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3;

        if (codigoAcessoValido && nivelPermissaoValido) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo:");
            if (!codigoAcessoValido) {
                System.out.println("Código de acesso inválido");
            }
            if (!nivelPermissaoValido) {
                System.out.println("Nível de permissão inválido");
            }
        }

        // exercicio 09 ---
        /*System.out.println("Digite a idade do doador: ");
        int idade = leitura.nextInt();
        System.out.println("Digite o peso do doador (em kg): ");
        double peso = leitura.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
        }*/

        // exercicio 08 ---
        /*System.out.println("Digite o primeiro lado: ");
        double lado1 = leitura.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double lado2 = leitura.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double lado3 = leitura.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados podem formar um triângulo. ");
        } else {
            System.out.println("Os lados não podem formar um triângulo. ");
        }*/

        // exercicio 07 ---
        /*System.out.println("Digite o valor do emprestimo: ");
        double valorEmprestimo = leitura.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            System.out.println("O valor de R$" + valorEmprestimo + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor de R$" + valorEmprestimo + " não está dentro do intervalo permitido para empréstimo.");
        }*/

        // exercicio 06 ---
        /*System.out.println("Insira o dia da semana: ");
        String diaSemana = leitura.nextLine();

        if (diaSemana.equalsIgnoreCase("sábado") || diaSemana.equalsIgnoreCase("domingo")) {
            System.out.println(diaSemana + " não é um dia útil.");
        } else {
            System.out.println(diaSemana + " é um dia útil.");
        }*/

        // exercicio 05 ---
        /*double valorDesconto = 10;
        System.out.println("Insira o valor da compra: ");
        double valorCompra = leitura.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Desconto de " + valorDesconto + "% aplicado.");
            double valorComDesconto = valorCompra-(valorCompra*(valorDesconto/100));
            System.out.println("Novo valor: " + valorComDesconto );
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor: " + valorCompra);
        }*/

        // exercicio 04 ---
        /*System.out.println("Insira o primeiro numero: ");
        double numero1 = leitura.nextDouble();
        System.out.println("Insira o segundo numero: ");
        double numero2 = leitura.nextDouble();

        if (numero1 == numero2) {
            System.out.println("O valores sao iguais");
        } else if (numero1 > numero2) {
            System.out.println("O numero 1: " + numero1 + " eh o maior.");
        } else {
            System.out.println("O numero 2: " + numero2 + " eh o maior.");
        }*/

        // exercicio 03 ---
        /*String senhaCorretamente = "123456";
        System.out.println("Insira a senha: ");
        String senha = leitura.nextLine();

        if (senha.equals(senhaCorretamente)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }*/

        // exercicio 02 ---
        /*System.out.println("Insira a media do aluno: ");
        double media = leitura.nextDouble();

        if (media >= 7) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5) {
            System.out.println("O estudante teve média " + media + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }*/

        // exercicio 01 ---
        /*System.out.println("Insira o valor: ");
        var valor = leitura.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O numero " + valor + " eh par.");
        } else {
            System.out.println("O numero " + valor + " eh impar.");
        }*/
    }
}
