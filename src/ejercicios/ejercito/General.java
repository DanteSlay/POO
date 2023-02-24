package ejercicios.ejercito;

public class General {
    //ATRIBUTOS
    private String nombre;
    public static int generales=0;

    //CONSTRUCTOR

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }

    //GETTER
    public static int getGenerales() {
        return generales;
    }


}
