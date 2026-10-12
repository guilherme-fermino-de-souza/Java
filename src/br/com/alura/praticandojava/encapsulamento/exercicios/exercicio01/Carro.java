package br.com.alura.praticandojava.encapsulamento.exercicios.exercicio01;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    public void exibirInformacoes() {
        System.out.printf("\nVeículo cadastrado:\n" +
                "Modelo: %s\n" +
                "Placa: %s\n" +
                "Ano: %d",
                modelo, placa, ano);
    }
}
