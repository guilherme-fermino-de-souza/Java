package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio06;

public class Conta {
    private String titular;
    private double saldo = 0;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor de deposito inválido!");
        } else {
            this.saldo += valorDeposito;
            System.out.println("Deposito feito com sucesso.");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println("Valor de saque inválido!");
        } else {
            if (valorSaque <= saldo) {
                saldo -= valorSaque;
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f\n",
                titular, saldo);
    }
}
