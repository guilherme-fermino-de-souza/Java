package br.com.alura.praticandojava.datahora.exercicios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Exercicios {
    public static void main(String[] args) {

        System.out.println("-- exercicio 01 --");
        String tarefa = "Enviar relatório semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data atual: " + dataCriacao);
        System.out.println("Hora atual: " + horaCriacao);



        System.out.println("\n-- exercicio 02 --");
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAtual.format(formatoData);
        String horaFormatada = horaAtual.format(formatoHora);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);



        System.out.println("\n-- exercicio 03 --");
        LocalTime horarioInicio = LocalTime.of(14, 30);
        LocalTime horarioFim = LocalTime.of(16, 45);

        Duration duracao = Duration.between(horarioInicio, horarioFim);

        System.out.println("Diferenca de tempo: " + duracao.toHoursPart()
                + " horas e " + duracao.toMinutesPart() + " minutos."
        );



        System.out.println("\n-- exercicio 04 --");
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 15;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataEntregaFormatada  = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataEntregaFormatada);



        System.out.println("\n-- exercicio 05 --");
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 3, 20);
        int adiamentoMeses = 1;
        LocalDate novaDataVencimentoOriginal = dataVencimentoOriginal.plusMonths(adiamentoMeses);

        DateTimeFormatter formatterMensagemVencimento = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataVencimentoFormatada =  novaDataVencimentoOriginal.format(formatterMensagemVencimento);
        System.out.println("Nova data de vencimento: " + dataVencimentoFormatada);



        System.out.println("\n-- exercicio 06 --");
        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        LocalDate dataAtualB = LocalDate.of(2025, 3, 15);

        DateTimeFormatter formatterEvent = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatado = dataEvento.format(formatterEvent);
        String dataAtualBFormatado = dataAtualB.format(formatterEvent);

        System.out.println("Data do evento: " + dataEventoFormatado);
        System.out.println("Data atual: " + dataAtualBFormatado);

        if (dataEvento.isBefore(dataAtualB)) {
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }



        System.out.println("\n-- exercicio 07 --");
        LocalDate dataVencimento = LocalDate.of(2025, 3, 30);
        int antecedenciaDias = 5;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);

        DateTimeFormatter formatterLembrete = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataLembreteFormatada = dataLembrete.format(formatterLembrete);

        System.out.println("Data do lembrete: " + dataLembreteFormatada);



        System.out.println("\n-- exercicio 08 --");
        ZonedDateTime horarioAtualTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatterHorario = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioTokyoFormatado = horarioAtualTokyo.format(formatterHorario);

        System.out.println("Horário atual em Tóquio: " + horarioTokyoFormatado);



        System.out.println("\n-- exercicio 09 --");
        ZonedDateTime horarioAtual = ZonedDateTime.now();
        ZonedDateTime horarioAtualSydney = horarioAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatterHoraEMinuto = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horário atual no sistema: " + horarioAtual.format(formatterHoraEMinuto));
        System.out.println("Horário atual em Sydney: " + horarioAtualSydney.format(formatterHoraEMinuto));



        System.out.println("\n-- exercicio 10 -->");

    }
}
