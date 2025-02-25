package EjerciciosPOO.Ejercicio5;

public class Domiciliacion {
    private int num_d;
    private String concepto;
    private double cantidad;
    private Cuenta_Corriente cuenta_Corriente;

    public Domiciliacion(int num_d, Cuenta_Corriente cuenta_Corriente) {
        this.num_d = num_d;
        this.cuenta_Corriente = cuenta_Corriente;
    }

    public int getNum_d() {
        return num_d;
    }

    public void setNum_d(int num_d) {
        this.num_d = num_d;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Cuenta_Corriente getCuenta_Corriente() {
        return cuenta_Corriente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setCuenta_Corriente(Cuenta_Corriente cuenta_Corriente) {
        this.cuenta_Corriente = cuenta_Corriente;
    }

    @Override
    public String toString() {
        return "Domiciliación: " + num_d + ", " + concepto + ", CC - " + cuenta_Corriente;
    }
}
