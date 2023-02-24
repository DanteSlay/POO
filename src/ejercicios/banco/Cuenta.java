package ejercicios.banco;

import java.util.Arrays;

public class Cuenta {

    //ATRIBUTOS
    private String iban;
    private double saldo;
    private boolean activa;
    private String[] dniTitulares;


    //CONSTRUCTOR
    public Cuenta(String iban, double saldo, boolean activa, String[] dniTitulares) {
        this.iban = iban;
        this.saldo = saldo;
        this.activa = activa;
        this.dniTitulares = dniTitulares;
    }


    //GETTERS
    public String getIban() {return iban;}

    public double getSaldo() {return saldo;}

    public boolean isActiva() {return activa;}

    public String[] getDniTitulares() {return dniTitulares;}


    //SETTERS
    public void setIban(String iban) {this.iban = iban;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void setActiva(boolean activa) {this.activa = activa;}

    public void setDniTitulares(String[] dniTitulares) {this.dniTitulares = dniTitulares;}


    @Override
    public String toString() {
        String estado;
        if(this.activa){
            estado = "activa";
        }else {
            estado = "desactivada";
        }
        String atributosObjetos = "iban= " + iban + '\'' +
                ", saldo= " + saldo +
                ", activa= " + estado +
                ", dniTitulares= " + Arrays.toString(dniTitulares);
        return atributosObjetos;
    }


    /**
     * Imprimir los datos de la cuenta
     */
    public void imprimirCuenta(){
        System.out.println(this.toString());
    }
}
