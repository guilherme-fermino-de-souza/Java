package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio06;

public class Notificacao {

    public void enviarMensagem(String mensagem) {
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    public void enviarMensagem(String remetente, String mensagem) {
        System.out.printf("Mensagem para %s: %s\n", remetente, mensagem);
    }

    public void enviarMensagem(String remetente, String mensagem, int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.printf("Mensagem para %s: %s\n", remetente, mensagem);
        }
    }
}
