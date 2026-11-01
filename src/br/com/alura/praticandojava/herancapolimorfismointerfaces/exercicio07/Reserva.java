package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio07;

import java.text.DateFormat;

public class Reserva {

    public void reservar() {
        System.out.print("\nReserva realizada");
    }

    public void reservar(String data) {
        System.out.printf("\nReserva feita para o dia %s", data);
    }

    public void reservar(String data, int quantidadePessoas) {
        System.out.printf("\nReserva feita para o dia %s para %d pessoas.",
                data, quantidadePessoas);
    }
}
