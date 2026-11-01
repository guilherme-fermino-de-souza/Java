package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio08;

public class Principal {
    public static void main(String[] args) {

        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );
        rel.imprimir();
    }
}
