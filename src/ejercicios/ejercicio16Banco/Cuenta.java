package ejercicios.ejercicio16Banco;

public class Cuenta {
    private final String iban;
    private float balance;
    private Usuario propietario;

    public Cuenta(String iban, float balance, Usuario propietario) {
        this.iban = iban;
        this.balance = balance;
        this.propietario = propietario;
    }

    public String iban() {
        return iban;
    }

    public float balance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Usuario propietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", balance=" + balance +
                ", propietario=" + propietario.toString() +
                '}';
    }
}
