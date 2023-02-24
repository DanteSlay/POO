package ejercicioExamen2.ejercicio1;

import ejercicios.ejercicio20.Estado;

import java.util.Arrays;
import java.util.Scanner;

public class Codigo {
    private String codigoEntero;

    private Estado estado;

    private final String RUSIA = "RU";


    //CONSTRUCTOR
    public Codigo() {
        String codigoEntero = pedirCodigo();
        this.codigoEntero=codigoEntero;
        if(pais().equals(RUSIA)){
            this.estado=Estado.BLOQUEADO;
        }else {
            this.estado=Estado.ACTIVO;
        }

    }

    //GETTERS
    public String codigoEntero() {
        return codigoEntero;
    }

    public String entidad() {
        return codigoEntero.substring(0, 4);
    }

    public String pais() {
        return codigoEntero.substring(4, 6);
    }

    public String localidad() {
        return codigoEntero.substring(6, codigoEntero.length());
    }


    @Override
    public String toString() {
        return "\nCodigo: "+codigoEntero+"\n----\nEntidad: "+entidad()+
                "\nPais: "+pais()+
                "\nLocalidad: "+localidad();
    }

    public String pedirCodigo() {
        String codigo;
        String t = "Introduce codigo: ";
        while (true) {
            System.out.print(t);
            codigo = in.nextLine();
            if ((codigo.length() == 8) || (codigo.length() == 11)) {
                break;
            } else {
                t = "El codigo tiene que ser de 8 o 11 valores, vuelva a intentarlo: ";
            }
        }
        return codigo;
    }


    public static Scanner in = new Scanner(System.in);
}
