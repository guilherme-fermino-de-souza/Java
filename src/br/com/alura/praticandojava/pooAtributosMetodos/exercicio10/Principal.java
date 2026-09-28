package br.com.alura.praticandojava.pooAtributosMetodos.exercicio10;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Item i1 = new Item("Teclado", 120.0, 1);
        Item i2 = new Item("Mouse", 60.0, 2);

        ArrayList<Item> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (Item item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
