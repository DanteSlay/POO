package ejercicios.cajero;

public class CuentaCorriente {
    //ATRIBUTOS
    final String DNI;//solo clases del mismo paquete
    public String nombre;//publico para todas clases
    private double saldo; //no visible otras clases
    private static String bancoId = "N26";
    public Gestor gestor;





    //CONSTRUCTOR
    public CuentaCorriente(String dni, String nombre) {
        this.DNI = dni;
        this.nombre=nombre;
        this.saldo=0;
    }

    public CuentaCorriente(String dni, double saldo) {
        this.DNI = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.DNI = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public CuentaCorriente(String DNI, String nombre, double saldo, Gestor gestor) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
        this.gestor = gestor;
    }

    //GETTERS
    public static String bancoId() {
        return bancoId;
    }


    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setBancoId(String bancoId) {
        CuentaCorriente.bancoId = bancoId;
    }


    @Override
    public String toString() {
        return  nombre+"\n----\nDni: "+DNI+
                "\nSaldo: "+saldo+
                "\nBanco: "+bancoId+
                "\nGestor: \n"+gestor;
    }




    /**
     * Ingresar dinero
     * @param ingreso
     * @return total
     */

    public double ingresar(int ingreso){
        return saldo += ingreso;
    }



    /**
     * Retirar saldo si la retirada es menor o igual al saldo, si no lanza error
     * @param retirada
     * @return si se ha podido llevar acabo la retirada
     */

    public boolean retirar(int retirada) {
        if (saldo >= retirada) {
            saldo -= retirada;
            return true;
        }else {
            System.out.println("No se ha podido realizar la retirada.");
            return false;
        }
    }

    public void añadirGestor(Gestor g){
        this.gestor=g;
    }
}
