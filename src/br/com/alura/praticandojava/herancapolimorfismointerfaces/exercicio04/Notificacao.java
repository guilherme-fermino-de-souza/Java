package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio04;

public abstract class Notificacao {
    protected String destinario;
    protected String mensagem;

    public Notificacao(String destinario, String mensagem) {
        this.destinario = destinario;
        this.mensagem = mensagem;
    }

    abstract void enviar();
}
