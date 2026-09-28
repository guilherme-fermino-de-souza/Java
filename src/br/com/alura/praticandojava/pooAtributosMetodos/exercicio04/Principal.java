package br.com.alura.praticandojava.pooAtributosMetodos.exercicio04;

public class Principal {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();
        sensor.local = "Setor A";
        sensor.temperaturaAtual = 39.2;

        sensor.exibirRelatorioAtual();
    }
}
