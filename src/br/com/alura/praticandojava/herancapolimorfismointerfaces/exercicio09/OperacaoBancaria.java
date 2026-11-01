package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio09;

public abstract class OperacaoBancaria implements AcaoBancaria{
    protected double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
}
