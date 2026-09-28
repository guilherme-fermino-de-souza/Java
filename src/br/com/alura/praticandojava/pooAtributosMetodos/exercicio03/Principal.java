package br.com.alura.praticandojava.pooAtributosMetodos.exercicio03;

public class Principal {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.saldo = 1579.42;

        c.exibirSaldo();
        c.zerarSaldo();
        c.exibirSaldo();
    }
}
