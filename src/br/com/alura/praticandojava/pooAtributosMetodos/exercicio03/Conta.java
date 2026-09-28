package br.com.alura.praticandojava.pooAtributosMetodos.exercicio03;

public class Conta {
    double saldo;

    void exibirSaldo () {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    void zerarSaldo () {
        saldo = 0;
    }
}
