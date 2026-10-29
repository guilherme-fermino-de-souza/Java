package br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal;

import br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal.modelos.Desenvolvedor;
import br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal.modelos.Funcionario;
import br.com.alura.praticandojava.herancapolimorfismointerfaces.Principal.modelos.Gerente;

public class Principal {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Roberta", 15000);
        gerente.reajustarSalario(2);
        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        ((Gerente) gerente).aprovarProjeto("uso de IA nos códigos Java");

        Funcionario desenvolvedor = new Desenvolvedor("Carla", 12000, "Backend Java");
        desenvolvedor.reajustarSalario();
        desenvolvedor.exibirInformacoes();
    }
}
