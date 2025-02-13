package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int id_a;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private List<Libro> libros;

    public Autor(int id_a, String nombre, String apellido1, String apellido2, int edad) {
        this.id_a = id_a;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.libros = new ArrayList<>();
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
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

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return this.id_a + " - " + this.nombre + " - " + this.apellido1 + " - " + this.apellido2 + " - " + this.edad;
    }

}
