package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio04;

public class Email extends Notificacao {
    private String assunto;

    public Email(String destinario, String mensagem, String assunto) {
        super(destinario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n",
                destinario, assunto, mensagem);
    }
}
