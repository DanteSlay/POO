package herencia;

public class Cliente extends Persona {
    protected String id;

    public Cliente(String nombre, String dni, String id){
        super(nombre, dni);
        this.id=id;
    }
}
