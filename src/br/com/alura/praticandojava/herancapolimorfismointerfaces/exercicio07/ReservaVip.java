package br.com.alura.praticandojava.herancapolimorfismointerfaces.exercicio07;

public class ReservaVip extends Reserva{

    @Override
    public void reservar() {
        System.out.print("\nReserva VIP confirmada com atendimento exclusivo");
    }
}
