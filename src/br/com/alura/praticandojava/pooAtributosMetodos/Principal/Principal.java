package br.com.alura.praticandojava.pooAtributosMetodos.Principal;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Ana", "Gerente de projetos", 9000);
        Funcionario funcionario02 = new Funcionario("Jonas", "Desenvolvedor", 8500);

        funcionario01.exibirInformacoes();
        funcionario02.reajustaSalario(5);
    }
}
