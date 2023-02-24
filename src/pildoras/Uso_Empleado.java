package pildoras;

import java.util.*;

public class Uso_Empleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Odin", 18000);
        Empleado empleado2 = new Empleado("Martina", 50000);
        Empleado empleado3 = new Empleado("Dante", 95000);

        ArrayList<Empleado> misEmpleados = new ArrayList<>();

        misEmpleados.add(empleado1);
        misEmpleados.add(empleado2);

        misEmpleados.add(empleado3);


        for (Empleado empleado: misEmpleados) {
            empleado.subeSueldo(10);
        }

        for (Empleado empleado: misEmpleados) {
            System.out.println("\nNombre: "+empleado.getNombre()+"\n"
                                +"Sueldo: "+empleado.getSueldo()+"\n"
                                +"Id: "+empleado.getId());
        }
    }

}

class Empleado{

    public Empleado(String nom, double sue){

        IdSiguiente++;
        nombre = nom;
        sueldo = sue;
        Id = IdSiguiente;




    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public int getId() {
        return Id;
    }

    //SETTERS
    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setSueldo(double sue){
        this.sueldo = sue;
    }


    /**
     * Incrementa el sueldo en un tanto por ciento
     * @param porcentaje
     */
    public void subeSueldo(double porcentaje){
        double aumento = sueldo*porcentaje/100;
        this.sueldo += aumento;
    }


    //ATRIBUTOS
    private String nombre;
    private  double sueldo;

    private int Id;
    private static int IdSiguiente=0;
}
