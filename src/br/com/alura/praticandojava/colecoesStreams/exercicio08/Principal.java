package br.com.alura.praticandojava.colecoesStreams.exercicio08;

import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> numerosQuadrado = numeros.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println(" Quadrados dos números: " + numerosQuadrado);
    }
}
