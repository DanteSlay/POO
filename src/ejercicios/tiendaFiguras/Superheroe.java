package ejercicios.tiendaFiguras;

public class Superheroe {
    //ATRIBUTOS
    private String nombre;
    private String descripcion;
    private boolean capa;



    //CONSTRUCTORES
    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }



    //GETTERS
    public String nombre() {
        return nombre;
    }

    public String descripcion() {
        return descripcion;
    }

    public boolean capa() {
        return capa;
    }


    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }


    @Override
    public String toString() {
        return nombre+"{"+descripcion+", capa->"+capa+"}";
    }
}
