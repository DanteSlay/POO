package ejercicioExamen2.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Espectador espectador = new Espectador();
        Ticket ticket = new Ticket(espectador);
        System.out.println(ticket);
    }
}
