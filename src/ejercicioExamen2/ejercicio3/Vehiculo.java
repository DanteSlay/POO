package ejercicioExamen2.ejercicio3;

import java.util.Scanner;

public class Vehiculo extends Funcionalidad {
    //ATRIBUTOS
    private String matricula;
    int velocidad;
    private final String matriculaFallo = "Matricula invalida, vuelva a intentarlo";

    //CONSTRUCTOR
    private Vehiculo() {
        this.matricula=pedirMatricula();
        this.velocidad=0;
    }

    //GETTERS
    public String matricula() {
        return matricula;
    }

    /**
     * bucle que pide la matricula hasta que sea correcta
     * @return String
     */
    public String pedirMatricula(){
        String matricula;
        String t = "\nMatricula: ";
        while (true){
            matricula = in.nextLine();
            if(matricula.length() != 7){
                t = matriculaFallo;
            } else {
                break;
            }
        }
        return matricula;
    }

    public String toString(){
        return "El vehiculo con matricula "+matricula+" va a "+velocidad+" Km/h";
    }
   public static Scanner in = new Scanner(System.in);
}
