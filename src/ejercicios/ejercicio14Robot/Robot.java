package ejercicios.ejercicio14Robot;

public class Robot {
    //ATRIBUTOS
    private String nombre;
    private String modelo;
    private int duracion;

    //CONSTRUCTORES
    public Robot() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";
    }

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    public Robot(String nombre, String modelo) {
        this(nombre, modelo, 20);
    }

    //GETTERS


    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public int getDuracion() {
        return duracion;
    }

    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
