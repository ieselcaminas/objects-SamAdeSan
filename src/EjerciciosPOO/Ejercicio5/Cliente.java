package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private List<Prestamo> prestamo;
    private List<CuentaCorriente> cuentaCorriente;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamo = new ArrayList<>();
        this.cuentaCorriente = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamo.add(prestamo);
    }

    public List<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void addCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }
}
