package br.com.alura.praticandojava.pooAtributosMetodos.exercicio04;

public class SensorTemperatura {
    String local;
    double temperaturaAtual;

    void exibirRelatorioAtual () {
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1fºC\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
