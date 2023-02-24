package ejercicios.cajero;

public class Gestor {
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    int max = 10000;





    //CONSTRUCTORES
    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Gestor(String nombre, String telefono, int max) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.max = max;
    }



    //GETTER

    public String nombre() {
        return nombre;
    }

    public String telefono() {
        return telefono;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return  nombre+"\n----\nTelefono: "+telefono+
                "\nMax: "+max;

    }
}
