package ejercicioExamen;

public class Persona {
    //ATRIBUTOS
    protected String dni;
    protected String nombre;


    //CONSTRUCTORES
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //GETTERS
    public String dni() {
        return dni;
    }

    public String nombre() {
        return nombre;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
                return "nombre: "+nombre+
                        ", dni:"+dni;
    }
}
