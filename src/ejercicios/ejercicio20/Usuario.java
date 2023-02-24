package ejercicios.ejercicio20;


public class Usuario {
    //ATRIBUTOS
    private final String USERNAME;
    protected String password, email;
    private  Estado estado;

    //CONSTRUCTOR
    public Usuario(String USERNAME, String email, String password){
        this.email=email;
        this.USERNAME=USERNAME;
        this.password=password;
        estado=Estado.PENDIENTE;
    }

    //GETTERS
    public String USERNAME() {
        return USERNAME;
    }

    public String password() {
        return password;
    }

    public String email() {
        return email;
    }

    public Estado estado() {
        return estado;
    }

    //SETTERS
    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "\n"+USERNAME + "\n-----\nEmail: "+email+
                "\nPassword: "+password+"\n";
    }

    public void mensajeEstado(){
        System.out.println("Estado del usuario "+USERNAME+":");
        switch (estado){
            case ACTIVO -> System.out.println("Todo ok, via libre\n");
            case PENDIENTE -> System.out.println("Tienes que esperar un poco\n");
            case BLOQUEADO -> System.out.println("Usuario bloqueado. Algo habras hecho\n");
            default -> System.out.println("Estado desconocido\n");
        }
    }

}
