package herencia;

import java.util.Date;

public class Empleado extends Persona {
    protected Date fecha_contrato;
    protected double salario;

    public Empleado(String nombre, String dni, Date fecha_contrato, double salario) {
        super(nombre, dni);
        this.fecha_contrato = fecha_contrato;
        this.salario = salario;
    }
}
