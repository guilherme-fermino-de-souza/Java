package br.com.alura.praticandojava.datahora.exercicios;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.println("Digite a carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.println("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        LocalTime saidaPrevisto = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevisto, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("Horário de entrada: " + entrada);
        System.out.println("Horário de saída previsto: " + saidaPrevisto);
        System.out.println("Horário real de saída: " + saidaReal);

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;
            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h"
                    + Math.abs(minutosExtras) + "min");
        }
    }
}
