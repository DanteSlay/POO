package ejercicioCuenta;

public class Cuenta {
    //ATRIBUTOS
    private String titular;
    private double cantidad;

    //CONSTRUCTORES
    /**
     * Crea cuenta con el valor del titular y cantidad
     * @param titular
     * @param cantidad
     */
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    /**
     * Crea cuenta con el titular y la cantidad a 0
     * @param titular
     */
    public Cuenta(String titular){
        this.titular = titular;
        this.cantidad = 0;
    }

    //METODOS
    public String getTitular(){
        return this.titular;
    }
    public double getCantidad(){
        return this.cantidad;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el me
     * @return
     */
    public String toString(){
        return "La cuenta de "+titular+" contiene "+cantidad+"€";
    }

    public void ingresar(double num){
        if(num > 0){
            this.cantidad += num;
        }
    }

    public void retirar(double num){
        if(this.cantidad - num < 0){
            this.cantidad = 0;
        }else {
            this.cantidad -= num;
        }
    }


}
