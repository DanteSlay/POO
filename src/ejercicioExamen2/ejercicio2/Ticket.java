package ejercicioExamen2.ejercicio2;

public class Ticket {
    //ATRIBUTO
    private double precio;
    private final double precioAdulto = 4;
    private final double precioMenor = 2;
    private Espectador espectador;

    //CONSTRUCTOR
    public Ticket(Espectador espectador){
        this.espectador = espectador;
        if(espectador.devolverTipo().equalsIgnoreCase("niño")){
            this.precio = precioMenor;
        }else {
            this.precio = precioAdulto;
        }
    }

    @Override
    public String toString() {
        return "TICKET DE ENTRADA\n"+
                espectador.devolverTipo()+"\tPrecio: "+precio+" €";
    }
}
