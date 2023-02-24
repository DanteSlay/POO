package ejercicioExamen;

public class Profesor extends Persona {
    //ATRIBUTOS
    private boolean tutor;

    //CONSTRUCTORES
    public Profesor(String dni, String nombre, boolean t){
        super(dni, nombre);
        this.tutor=t;
    }
}
