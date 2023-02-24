package herencia;

import java.util.Date;

public class Manager extends Empleado {
    protected static String puesto = "Manager";

    public Manager(String nombre, String dni, Date date, double salario){
        super(nombre, dni, date, salario);
    }
}
