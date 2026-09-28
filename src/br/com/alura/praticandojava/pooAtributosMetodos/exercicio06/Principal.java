package br.com.alura.praticandojava.pooAtributosMetodos.exercicio06;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Júlia Oliveira";
        f.cargo = "Pessoa Desenvolvedora Júnior";
        f.nivelDeAcesso = 1;

        f.alterarCargoENivelAcesso("Desenvolvedor Pleno", 2);
    }
}
