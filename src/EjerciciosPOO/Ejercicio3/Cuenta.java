package EjerciciosPOO.Ejercicio3;

public class Cuenta {
    private String titular;
    private int cantidad;

    public Cuenta(int cantidad, String titular) {
        this.cantidad = cantidad;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString(){
        return this.titular + " - " + this.cantidad;
    }

}
