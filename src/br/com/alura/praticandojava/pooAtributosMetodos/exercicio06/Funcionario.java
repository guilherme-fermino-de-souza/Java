package br.com.alura.praticandojava.pooAtributosMetodos.exercicio06;

public class Funcionario {
    String nome;
    String cargo;
    int nivelDeAcesso;

    void alterarCargoENivelAcesso (String novoCargo, int novoNivelDeAcesso) {
        System.out.println("--- Antes da atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Nível de acesso: %d\n", nivelDeAcesso);

        cargo = novoCargo;
        nivelDeAcesso = novoNivelDeAcesso;

        System.out.println("\n--- Após atualização ---");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Nível de acesso: %d", nivelDeAcesso);
    }
}
