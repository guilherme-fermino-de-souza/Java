package br.com.alura.praticandojava.pooAtributosMetodos.exercicio02;

public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro (String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirResumo() {
        System.out.printf("\"%s\" de %s com %d páginas.", titulo, autor, paginas);
    }
}
