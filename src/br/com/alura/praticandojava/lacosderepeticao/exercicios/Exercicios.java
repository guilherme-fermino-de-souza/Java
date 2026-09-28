package br.com.alura.praticandojava.lacosderepeticao.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // exercício 10
        ArrayList<String> convidados = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            String nome = leitura.nextLine().trim();

            if (nome.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado");
                break;
            }

            if (nome.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: " + convidados);
                continue;
            }

            boolean jaExiste = false;
            for (String convidado : convidados) {
                if (convidado.toLowerCase().equals(nome.toLowerCase())) {
                    jaExiste = true;
                    break;
                }
            }

            if (jaExiste) {
                System.out.println("O nome " + nome + " já está na lista de convidados.");
            } else {
                convidados.add(nome);
                System.out.println(nome + " foi adicionado à lista de convidados.");
            }

        }
        leitura.close();

        // exercício 09
        /*System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        for (int i = 1; i <= numero; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.println(i + " ");
        }
        leitura.close();*/

        // exercício 08
        /*int positivos = 0;
        int negativos = 0;

        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String entrada = leitura.nextLine();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            int numero = Integer.parseInt(entrada);
            if (numero < 0) {
                negativos++;
            } else if (numero > 0){
                positivos++;
            }
        }
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        leitura.close();*/

        // exercício 07
        /*boolean nomeValido = false;
        String nome = "indefinido";
        do {
            System.out.println("Digite seu nome: ");
            nome = leitura.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            } else {
                nomeValido = true;
            }
        } while (nome.length() < 3);
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
        leitura.close();*/

        // exercício 06
        /*String senhaCorreta = "1234";
        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha: ");
            String senha = leitura.nextLine();
            if (senha.equalsIgnoreCase(senhaCorreta)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativas > 1){
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.  ");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        leitura.close();*/

        // exercício 05
        /*System.out.println("Digite os números separados por espaço: ");
        String[] numerosStr = leitura.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior) {
                maior = num;
            }
        }
        System.out.println("O maior número é: " + maior);
        leitura.close();*/

        // exercício 04
        /*System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);*/

        // exercício 03
        /*int resultado = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                resultado += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + resultado);*/

        // exercício 02
        /*int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int valor: valores) {
            soma += valor;
        }
        System.out.println("A soma total das receitas é: " + soma);*/

        // exercício 01
        /*System.out.println("Digite a quantidade de degraus: ");
        int degraus = leitura.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
        leitura.close();*/
    }
}
