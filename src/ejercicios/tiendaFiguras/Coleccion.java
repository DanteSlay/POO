package ejercicios.tiendaFiguras;

import java.util.ArrayList;

public class Coleccion {
    //ATRIBUTOS
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;


    //CONSTRUCTOR
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }


    //GETTERS
    public String nombreColeccion() {
        return nombreColeccion;
    }

    public ArrayList<Figura> listaFiguras() {
        return listaFiguras;
    }


    @Override
    public String toString() {
        String cadena = "Coleccion "+nombreColeccion+"\n-----\n";
        for(Figura f:listaFiguras){
            cadena += f+"\n";
        }
        return cadena;
    }


    //SETTERS
    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }


    //MODIFICADORES

    /**
     * Añade una figura a la coleccion
     * @param figura
     */
    public void añadirFigura(Figura figura) {
        this.listaFiguras.add(figura);
    }

    /**
     * Sube el precio de una figura de la coleccion
     * @param cantidad
     * @param id
     */
    public void subirPrecio(String id, double cantidad){
        for(Figura f:listaFiguras){
            if(f.codigo().equals(id)){
                f.subirPrecio(cantidad);
            }
        }
    }



    /**
     * Devuelve un listado de las figuras con capa
     *
     * @return el listado String
     */
    public StringBuilder conCapa() {
        StringBuilder cadena = new StringBuilder("Superheroes con capa\n-----\n");
        for (Figura f : listaFiguras) {
            if (f.superheroe().capa()) {
                cadena.append(f).append("\n");
            }
        }
        return cadena;
    }


    /**
     * Devolver la figura mas valiosa de la coleccion
     * @return figura
     */
    public Figura masValioso(){
        Figura fMasValiosa = null;
        double masValiosa = 0;
        for(Figura f:listaFiguras){
            if(f.precio()>masValiosa){
                masValiosa = f.precio();;
                fMasValiosa = f;
            }
        }
        return fMasValiosa;
    }

    /**
     * Devuelve el precio total de la coleccion
     * @return double valor total
     */
    public double getValorColeccion(){
        double valorTotal = 0.0;
        for(Figura f:listaFiguras){
            valorTotal += f.precio();
        }
        return valorTotal;
    }


    /**
     * Devuelve el volumen total de la coleccion
     * @return double
     */
    public double getVolumenColeccion(){
        double volColeccion = 200;
        for(Figura f:listaFiguras){
            volColeccion += f.dimension().getVolumen();
        }
        return volColeccion;
    }


}
