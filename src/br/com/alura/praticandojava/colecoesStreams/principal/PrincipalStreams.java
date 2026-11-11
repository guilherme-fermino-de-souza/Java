package br.com.alura.praticandojava.colecoesStreams.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrincipalStreams {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Armando");

        List<String> funcionariosLetraA = funcionarios.stream()
                .filter(f -> f.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(funcionarios);
        System.out.println(funcionariosLetraA);

        List<Double> valorVendas = List.of(500.00, 1800.00, 6200.00);

        List<Double> comissao = valorVendas.stream()
                .map(v -> v * 0.05)
                .collect(Collectors.toList());

        System.out.println(valorVendas);
        System.out.println(comissao);

        double totalVendas = valorVendas.stream().reduce(0.0, Double::sum);
        System.out.println("Total vendas: R$" + totalVendas);
    }
}
