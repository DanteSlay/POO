package cuentaBasico;

public class Cuenta {

    //ATRIBUTOS
    private String nombre;
    private String cc;
    private double interes;
    private double saldo;

    //CONSTRUCTORES
    public Cuenta(){
    }

    public Cuenta(String nombre, String cc, double interes, double saldo){
        this.nombre = nombre;
        this.cc=cc;
        this.interes=interes;
        this.saldo=saldo;
    }

    public Cuenta(final Cuenta c){
        nombre=c.nombre;
        cc=c.cc;
        interes=c.interes;
        saldo=c.saldo;

    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getCc(){
        return cc;
    }
    public double getInteres(){
        return interes;
    }
    public double getSaldo(){
        return  saldo;
    }

    //GETTERS
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCc(String cc){
        this.cc=cc;
    }
    public void setInteres(double interes){
        this.interes=interes;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", cc='" + cc + '\'' +
                ", interes=" + interes +
                ", saldo=" + saldo +
                '}';
    }

    /**
     * Comprobamos si se puede hacer el ingreso
     * @param ingreso
     * @return true o false
     */
    public boolean ingreso(double ingreso) {
        boolean ingresoCheck = true;
        if(ingreso < 0){
            ingresoCheck = false;
        }else {
            saldo+=ingreso;
        }
        return ingresoCheck;
    }

    /**
     * Comprobamos si se puede realizar el reintegro
     * @param disminucion
     * @return true o false
     */
    public boolean reintegro(double disminucion){
        boolean check=true;
        if((saldo - disminucion)<0){
            check=false;
        }else {
            saldo -= disminucion;
        }
        return check;
    }

    /**
     * Vrifica si la cantidad es mayor que cero y si es asi intenta realizar la transferencia
     * @param c
     * @param cantidad
     * @return true o false
     */
    public boolean transferencia(Cuenta c, double cantidad){
        boolean check=true;
        if (cantidad < 0){
            check=false;
        } else if (cantidad>=0) {
            reintegro(cantidad);
            c.ingreso(cantidad);
        }else {check=false;}
        return check;
    }
}
