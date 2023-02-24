package ejercicios.banco;



public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("ES5820804837701778762847", 10000, true, new String[]{"50237842E", "50237852F"});
        System.out.println(cuenta1.getSaldo());
        cuenta1.setSaldo(15000);
        System.out.println(cuenta1.getSaldo());
    }
}
