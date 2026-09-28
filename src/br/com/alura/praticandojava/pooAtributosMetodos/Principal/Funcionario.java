package br.com.alura.praticandojava.pooAtributosMetodos.Principal;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirInformacoes () {
        System.out.printf("\nFuncionario %s - Cargo: %s - Salário %.2f",
                nome, cargo, salario);
    }

    public void reajustaSalario (double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salário de %s é %.2f", nome, salario);
    }
}
