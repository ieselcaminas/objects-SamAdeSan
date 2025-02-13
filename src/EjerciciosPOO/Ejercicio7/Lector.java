package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String dni;
    private String nombre;
    private String apellido;
    private String apellido2;
    private int edad;
    private List<Prestamo> prestamos;
    private List<Historico> historicos;

    public Lector(String dni, String nombre, String apellido, String apellido2, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.prestamos = new ArrayList<>();
        this.historicos = new ArrayList<>();
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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
        this.prestamos.add(prestamo);
    }

    public List<Historico> getHistorico() {
        return historicos;
    }

    public void addHistorico(Historico historico) {
        this.historicos.add(historico);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre + " - " + this.apellido + " - " + this.edad + " - " + this.prestamos + " - " + this.historicos;
    }

}
