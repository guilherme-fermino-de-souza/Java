package br.com.alura.praticandojava.stringRegex.principal;

public class PrincipalString {
    public static void main(String[] args) {
        String professor = "Jacqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = """
                Pós-graduada em Engenharia e
                Arquitetura de Software;
                Desenvolvedora backend Java desde 2010;
                """;

        String texto = String.format("Disciplina: %s - %s", disciplina.trim(), professor.toUpperCase());
        System.out.println(texto);

        System.out.printf("Nome: %s %nDisciplina: %s",
                professor.replace("Oliveira", "Magalhães"),
                disciplina);

        System.out.println("\n" + curriculo);
    }
}
