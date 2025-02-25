package EjerciciosPOO.Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;
    //dos constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public Cuenta(String titular) {
        this.titular = titular;
    }
    //getters y setters
    public String getTitular() {
        return titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    //métodos especiales
    public void ingresar(double cantidad) {
        this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }
    @Override
    public String toString() {
        return "Titular de la cuenta: " + this.titular + "\t Cantidad seleccionada: " + this.cantidad + ".";
    }
}
