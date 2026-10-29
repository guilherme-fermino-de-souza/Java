package br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal.modelos;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes () {
        System.out.printf("\nFuncionário %s - Salário: %.2f",
                nome, salario);
    }

    public void reajustarSalario (double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salário de %s é %.2f.", nome, salario);
    }

    public void reajustarSalario() {
        salario += 500;
        System.out.printf("\nSalário com dissídio de %s é %.2f.", nome, salario);
    }

    public abstract void calcularPLR();
}
