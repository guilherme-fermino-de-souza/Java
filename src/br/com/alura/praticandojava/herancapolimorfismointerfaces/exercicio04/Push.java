package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio04;

public class Push extends Notificacao {
    private String titulo;

    public Push(String destinario, String mensagem, String titulo) {
        super(destinario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s\nConteúdo: %s\n",
                destinario, titulo, mensagem);
    }
}
