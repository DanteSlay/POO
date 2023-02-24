package ejercicios.cajero;

public class Main {
    public static void main(String[] args) {
       CuentaCorriente cc = new CuentaCorriente("01", "odin");
        cc.ingresar(2500);
        System.out.println("Cuenta 1 con 2500€: "+cc+"\n");
        cc.retirar(1000);
        System.out.println("Cuenta 1 tras retirar 1000€: "+cc+"\n");
        cc.retirar(2500);
        System.out.println("Cuenta 1 tras retirar 2500€: "+cc+"\n");


        CuentaCorriente c2 = new CuentaCorriente("22222E",50);
        System.out.println("Cuenta 2: "+c2+"\n");
        c2.setNombre("Martina");
        //System.out.println(c2.toString());

        Gestor g1 = new Gestor("Odin", "666666666");
        cc.añadirGestor(g1);
        System.out.println("\n"+cc);

        Gestor g2 = new Gestor("dante", "666", 5000);
        c2.añadirGestor(g2);
        System.out.println("\n"+c2);





    }
}
