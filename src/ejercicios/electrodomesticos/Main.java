package ejercicios.electrodomesticos;

public class Main {
    public static void main(String[] args) {
        Electrodomestico nevera = new Electrodomestico("Nevera", "Samsung", 3);
        System.out.println(nevera);
        System.out.println("En 10 horas la nevera ha consumido "+nevera.getConsumo(10)+"kW/h");
        System.out.println("El precio de esas 10 horas a 100 euro el kW/h: "+nevera.getCosteConsumo(10, 100));

        Lavadora lav = new Lavadora("Samsung", 3, 500, true);
        System.out.println(lav);
        System.out.println("En 10 horas la nevera ha consumido "+lav.getConsumo(10)+"kW/h");
        System.out.println("El precio de esas 10 horas a 100 euro el kW/h: "+lav.getCosteConsumo(10, 100));

    }
}
