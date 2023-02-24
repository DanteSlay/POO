package ejercicios.electrodomesticos;

public class Lavadora extends Electrodomestico {
    //ATRIBUTOS
    private static final String tipo= "Lavadora";
    private double precio;
    private boolean aguaCaliente;

    //CONSTRUCTORES
    public Lavadora(String marca, double potencia) {
        super(tipo, marca, potencia);
    }
    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    //GETTERS
    public double precio() {
        return precio;
    }

    public boolean aguaCaliente() {
        return aguaCaliente;
    }

    //SETTERS
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return tipo + "\n----\nPrecio: " + precio +
                "\nMarca: "+marca+
                "\nPrecio: "+precio+
                "\nPotencia: "+potencia+
                "\nAgua Caliente: " + aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        if(aguaCaliente){
            return horas * (potencia + potencia * 0.20);
        }else {
            return getConsumo(horas);
        }
    }
}
