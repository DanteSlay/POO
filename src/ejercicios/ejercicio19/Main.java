package ejercicios.ejercicio19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Enumerados> estaciones = new ArrayList<>();
        estaciones.add(Enumerados.INVIERNO);
        estaciones.add(Enumerados.PRIMAVERA);
        estaciones.add(Enumerados.VERANO);
        estaciones.add(Enumerados.OTOÑO);

        ArrayList<Enumerados> dia = new ArrayList<>();
        dia.add(Enumerados.MAÑANA);
        dia.add(Enumerados.MEDIODIA);
        dia.add(Enumerados.TARDE);
        dia.add(Enumerados.NOCHE);

        ArrayList<Enumerados> comidas = new ArrayList<>();
        comidas.add(Enumerados.DESAYUNO);
        comidas.add(Enumerados.ALMUERZO);
        comidas.add(Enumerados.MERIENDA);
        comidas.add(Enumerados.CENA);

        System.out.println("estaciones: "+estaciones);
        System.out.println("dia: "+dia);
        System.out.println("comidas: "+comidas);
    }
}
