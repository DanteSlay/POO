package ejercicios.ejercito;

public class Unidad {
    //ATRIBUTOS
    private String nombre;
    private static int unidades=0;

    //CONSTRUCTOR

    public Unidad(String nombre) {
        this.nombre = nombre;
        unidades++;
    }

    //GETTER
    public static int getUnidades() {
        return unidades;
    }
}
