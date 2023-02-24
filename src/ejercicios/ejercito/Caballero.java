package ejercicios.ejercito;

public class Caballero {
    //ATRIBUTOS
    private String nombre;
    public static int caballeros=0;

    //CONSTRUCTOR

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }

    //GETTER
    public static int caballeros() {
        return caballeros;
    }
}
