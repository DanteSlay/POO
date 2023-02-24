package ejercicioCuenta;

public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta01 = new Cuenta("Odin");
        Cuenta cuenta02 = new Cuenta("Martina", 250);

        System.out.println(cuenta01.toString());
        System.out.println(cuenta02.toString());

        cuenta01.ingresar(1000);
        cuenta02.retirar(260);

        System.out.println(cuenta01.toString());
        System.out.println(cuenta02.toString());
    }

}
