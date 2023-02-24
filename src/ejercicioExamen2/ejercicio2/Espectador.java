package ejercicioExamen2.ejercicio2;

import java.util.Scanner;

public class Espectador {
    //ATRIBUTOS
    private final int edad;

    //CONSTRUCTOR
    public Espectador(){
        this.edad=pedirEdad();
    }

    /**
     * Bucle que pide la edad hasta que esta sea mayor que 0
     * @return int
     */
    private int pedirEdad(){
        int edad;
        String t = "¿Edad?";
        while (true){
            System.out.println(t);
            edad = in.nextInt();
            if(edad > 0){
                break;
            }else {
                t = "Valor incorrecto, vuelva a intentarlo:";
            }
        }
        return edad;
    }

    /**
     * Si la edad del cliente es mayor que 18 devuelve el tipo Adulto, si no devuelve Niño
     * @return String
     */
    public String devolverTipo(){
        if(edad < 18){
            return "Niño";
        }else {
            return "Adulto";
        }
    }

    public static Scanner in = new Scanner(System.in);
}
