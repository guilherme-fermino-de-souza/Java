package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio06;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana");
        conta.depositar(1000);
        conta.sacar(1200);
        conta.exibirSaldo();

        Conta conta2 = new Conta("Pedro");
        conta2.depositar(1000);
        conta2.sacar(200);
        conta2.exibirSaldo();
    }
}
