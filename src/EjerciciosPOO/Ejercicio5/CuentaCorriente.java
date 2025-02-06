package EjerciciosPOO.Ejercicio5;

public class CuentaCorriente {
    private int num_cc;
    private double saldo;
    private Cliente cliente;

    public CuentaCorriente(int num_cc, double saldo, Cliente cliente) {
        this.num_cc = num_cc;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNum_cc() {
        return num_cc;
    }

    public void setNum_cc(int num_cc) {
        this.num_cc = num_cc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return this.num_cc + "\t" + this.saldo;
    }
}