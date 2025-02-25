package EjerciciosPOO.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String tipo;
    private List<Libro> libros = new ArrayList<>();

    public Tema(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "Tema: " + this.tipo + "\nLibros: " + this.libros + ".";
    }
}
