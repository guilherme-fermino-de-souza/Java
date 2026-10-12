package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio05;

public class Bateria {
    private int nivel;

    public void setNivel(int nivel) {
        if (nivel >= 0 && nivel <= 100) {
            this.nivel = nivel;

        } else {
            System.out.println("Valor inválido.");
        }
    }

    public int getNivel() {
        return nivel;
    }

    public String exibirStatus() {
        if (nivel >= 80) {
            return ("Bateria cheia");
        } else if (nivel >= 21) {
            return ("Bateria ok");
        } else {
            return ("Bateria fraca");
        }

    }
}