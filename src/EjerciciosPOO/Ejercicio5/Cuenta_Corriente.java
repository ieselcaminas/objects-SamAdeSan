package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Cuenta_Corriente {
    private int num_cc;
    private String nombre;
    private double saldo;
    private Sucursal sucursal;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Domiciliacion> domiciliaciones = new ArrayList<>();

    public Cuenta_Corriente(int num_cc, String nombre, double saldo, Sucursal sucursal) {
        this.num_cc = num_cc;
        this.nombre = nombre;
        this.saldo = saldo;
        this.sucursal = sucursal;
    }

    public int getNum_cc() {
        return num_cc;
    }

    public void setNum_cc(int num_cc) {
        this.num_cc = num_cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion) {
        domiciliaciones.add(domiciliacion);
    }
}