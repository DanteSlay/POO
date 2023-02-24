package ejercicios.ejercicio16Banco;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("demo", "Ale", "Chim Pom");
        Cuenta cuenta1 = new Cuenta("123456", 1000, usuario1);
        Usuario usuario2 = new Usuario("hola", "odin", "de la hoz");
        Cuenta cuenta2 = new Cuenta("123456", 1000, usuario2);

        System.out.println(cuenta2.toString());
    }



}
