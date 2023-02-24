package ejercicios.tiendaFiguras;

public class Dimension {
    //ATRIBUTOS
    private double alto;
    private double ancho;
    private double profundidad;


    //CONSTRUCTORES
    public Dimension(){
        this.alto=0;
        this.profundidad=0;
        this.ancho=0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }


    //GETTERS
    public double alto() {
        return alto;
    }

    public double ancho() {
        return ancho;
    }

    public double profundidad() {
        return profundidad;
    }


    //SETTERS
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }


    @Override
    public String toString() {
        return "alto->"+alto+", "+"ancho->"+ancho+", profundidad->"+profundidad;
    }


    /**
     * Devuelve el volumen de la dimension
     * @return volumen
     */
    public double getVolumen(){
        return alto * ancho * profundidad;
    }
}
