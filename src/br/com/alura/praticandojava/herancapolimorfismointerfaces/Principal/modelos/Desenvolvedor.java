package br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal.modelos;

public class Desenvolvedor extends Funcionario{
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nDesenvolvedor: %s - Salário %.2f - Stack: %s",
                super.nome, super.salario, stack);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do desenvolvedor");
    }
}
