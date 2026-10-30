package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio05;

public class CartaoCredito extends Pagamento{

    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("\nPagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)",
                valor, calcularTaxa());
    }

    public double calcularTaxa () {
        return valor * 0.03;
    }
}
