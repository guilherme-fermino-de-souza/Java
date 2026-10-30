package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio05;

public class Principal {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito(250.00);
        Pagamento boleto = new BoletoBancario(500.00);
        Pagamento pix = new Pix(300.00);

        cartao.confirmarPagamento();
        boleto.confirmarPagamento();
        pix.confirmarPagamento();

    }
}