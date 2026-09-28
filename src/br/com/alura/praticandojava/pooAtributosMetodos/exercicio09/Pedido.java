package br.com.alura.praticandojava.pooAtributosMetodos.exercicio09;

public class Pedido {
    String titulo;
    int diasAtraso;

    public Pedido(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes () {
        double multa = calcularMulta();
        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f.", titulo, diasAtraso, multa);
    }
}
