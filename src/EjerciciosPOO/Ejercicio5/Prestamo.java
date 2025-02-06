package EjerciciosPOO.Ejercicio5;

public class Prestamo {
    private int num_prestamo;
    private int cantidad;
    private Cliente cliente;

    public Prestamo(int num_prestamo, int cantidad, Cliente cliente) {
        this.num_prestamo = num_prestamo;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getNum_prestamo() {
        return num_prestamo;
    }

    public void setNum_prestamo(int num_prestamo) {
        this.num_prestamo = num_prestamo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.num_prestamo + "\t" + this.cantidad + "\t" + this.cliente;
    }
}
