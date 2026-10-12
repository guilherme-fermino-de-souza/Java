package br.com.alura.praticandojava.encapsulamento.principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jonas", 8500);
        funcionario.setCargo("Desenvolvedor");

        System.out.println("Funcionário tem o nome " + funcionario.getNome());
        System.out.println("Funcionário tem o cargo " + funcionario.getCargo());
        System.out.println("Funcionário tem o salário " + funcionario.getSalario());

        funcionario.exibirInformacoes();
        funcionario.reajusteSalario(5);
        funcionario.exibirInformacoes();
        funcionario.reajusteSalario(5);
        funcionario.exibirInformacoes();
    }
}
