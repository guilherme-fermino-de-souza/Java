package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio04;

public class Sms extends Notificacao {

    public Sms(String destinario, String mensagem) {
        super(destinario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n",
                destinario, mensagem);
    }
}
