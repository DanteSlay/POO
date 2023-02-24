package ejercicios.electrodomesticos;

public class Electrodomestico {
    //ATRIBUTOS
    protected String tipo;
    protected String marca;
    protected double potencia;

    //CONSTRUCTOR
    public Electrodomestico(String tipo, String marca, double potencia) {
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    //GETTERS
    public String tipo() {
        return tipo;
    }

    public String marca() {
        return marca;
    }

    public double potencia() {
        return potencia;
    }

    //SETTERS
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    //ToString
    public String toString(){
        return tipo+"\n------\nMarca: "+marca+"\nPotencia: "+potencia;
    }

    /**
     * Calcular el consumo durante X horas
     * @param horas int
     * @return double
     */
    public double getConsumo(int horas){
        return potencia * horas;
    }

    /**
     * Calcular el coste total de X horas a un precio Y
     * @param horas int
     * @param costeHora double
     * @return double
     */
    public double getCosteConsumo(int horas, double costeHora){
        return getConsumo(horas) * costeHora;
    }

}
