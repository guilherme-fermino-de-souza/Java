package br.com.alura.praticandojava.pooAtributosMetodos.exercicio02;

public class Principal {
        public static void main(String[] args) {
            Livro l = new Livro(
                    "O Guia do Mochileiro das Galáxias",
                    "Douglas Adams",
                    208);

            l.exibirResumo();
        }
}
