package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private List<Prestamo> prestamos = new ArrayList<>();
    private List<Cuenta_Corriente> ccs = new ArrayList<>();

    public Cliente(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Cuenta_Corriente> getCC() {
        return ccs;
    }

    public void addCC(Cuenta_Corriente cuentaCorriente) {
        ccs.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return "Datos del cliente: " + this.dni + ", " + this.nombre + ", " + this.apellidos + ", " + this.edad;
    }
}
