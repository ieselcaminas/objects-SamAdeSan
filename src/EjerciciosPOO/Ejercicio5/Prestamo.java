package EjerciciosPOO.Ejercicio5;

public class Prestamo {
    private int num_p;
    private double saldo;
    private Cliente cliente;
    private Sucursal sucursal;

    public Prestamo(int num_p, double saldo, Cliente cliente, Sucursal sucursal) {
        this.num_p = num_p;
        this.saldo = saldo;
        this.cliente = cliente;
        this.sucursal = sucursal;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Préstamo " +  this.num_p + " de un saldo de: " + this.saldo + " del cliente: " + this.cliente + " de la sucursal " + this.sucursal + ".";
    }
}
