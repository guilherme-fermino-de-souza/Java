package br.com.alura.praticandojava.pooAtributosMetodos.exercicio07;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Estudar Java", false);
        Tarefa t2 = new Tarefa("Fazer exercícios", true);

        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        listaTarefas.add(t1);
        listaTarefas.add(t2);

        for (Tarefa t : listaTarefas) {
            t.descricao();
        }
    }
}
