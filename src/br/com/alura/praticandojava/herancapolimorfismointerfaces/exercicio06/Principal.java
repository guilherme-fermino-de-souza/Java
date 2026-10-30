package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio06;

public class Principal {
    public static void main(String[] args) {
        Notificacao notificacao = new Notificacao();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
