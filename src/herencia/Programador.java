package herencia;

import java.util.Date;

public class Programador extends Empleado {
    protected static String puesto = "Programador";
    protected String lenguaje = "Java";

    public Programador(String nombre, String dni, Date date, double salario, String lenguaje){
        super(nombre, dni, date, salario);
        this.lenguaje=lenguaje;
    }
}
