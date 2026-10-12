package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio05;

public class Principal {
    public static void main(String[] args) {
        Bateria b = new Bateria();
        b.setNivel(85);
        System.out.println("Status: " + b.exibirStatus());
    }
}
