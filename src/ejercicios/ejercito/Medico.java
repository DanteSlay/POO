package ejercicios.ejercito;

public class Medico {
    //ATRIBUTOS
    private String nombre;
    public static int medicos=0;

    //CONSTRUCTOR

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }

    //GETTER
    public static int getMedicos() {
        return medicos;
    }
}
