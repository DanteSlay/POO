package ejercicios.ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Dante", "dante@...", "1234");
        System.out.println(u1);

        ArrayList<String> datos = pedirDatos();
        Usuario u2 = new Usuario(datos.get(0), datos.get(1), datos.get(2));

        System.out.println(u2);


        u1.mensajeEstado();

        u1.setEstado(Estado.ACTIVO);


        u1.mensajeEstado();

    }

    public static ArrayList<String> pedirDatos(){
        ArrayList<String> datos = new ArrayList<>();
        System.out.println("\nVamos a crear un usuario nuevo:\nNombre: ");
        datos.add(in.nextLine());
        System.out.println("Email: ");
        datos.add(in.nextLine());
        System.out.println("Password: ");
        datos.add(in.nextLine());
        return datos;
    }

}
