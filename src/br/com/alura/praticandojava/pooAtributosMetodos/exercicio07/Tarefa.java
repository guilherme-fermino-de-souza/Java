package br.com.alura.praticandojava.pooAtributosMetodos.exercicio07;

public class Tarefa {
    String descricao;
    Boolean concluida;

    public Tarefa(String descricao, Boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    void descricao() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
