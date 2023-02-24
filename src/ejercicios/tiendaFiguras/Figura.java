package ejercicios.tiendaFiguras;

public class Figura {
    //ATRIBUTOS
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;


    //CONSTRUCTORES
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }


    //GETTERS

    public String codigo() {
        return codigo;
    }

    public double precio() {
        return precio;
    }

    public Superheroe superheroe() {
        return superheroe;
    }

    public Dimension dimension() {
        return dimension;
    }


    //SETTERS

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return  "Figura de "+superheroe.nombre()+ ":\n"+
                "Codigo: "+codigo+"\n"+
                "Precio: "+precio+"\n"+
                "Dimension: "+dimension+"\n";

    }


    /**
     * Sube el precio de la figura
     * @param cantidad
     */
    public void subirPrecio(double cantidad){
        precio += cantidad;
    }




}
