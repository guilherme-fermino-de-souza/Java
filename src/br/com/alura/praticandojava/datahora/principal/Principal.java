package br.com.alura.praticandojava.datahora.principal;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
        // iniciar valores
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 11, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isBefore(LocalDate.now())) {
            System.out.println("Anterior ao dia do vencimento");
        } else {
            System.out.println("Superior ao dia do vencimento");
        }

        System.out.println("Data compra:" + dataCompra);
        System.out.println("Data primeira parcela:" + dataPrimeiraParcela);
        System.out.println("Data segunda parcela:" + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\nData compra formatada:" + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();

        System.out.println("\nData conclusao compra:" + dataConclusaoCompra);
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(
                ZoneId.of("America/New_York"));
        System.out.println("\nData conclusao compra Ny:" + dataCompraNy);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);

        System.out.println("Duracao do expediente: " + duracao.toHours() +
                " hora e " + duracao.toMinutesPart() + " minutos");

        LocalDate dataPagamento = LocalDate.parse("2026-12-30");
        long periodo = ChronoUnit.DAYS.between(dataCompra, dataPagamento);
        System.out.println("Diferenca em dias: " + periodo);
    }
}
