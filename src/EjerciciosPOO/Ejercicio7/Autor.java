package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int cod_aut;
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    public Autor(int co_aut, String nombre) {
        this.cod_aut = co_aut;
        this.nombre = nombre;
    }

    public int getCod_aut() {
        return cod_aut;
    }

    public void setCod_aut(int cod_aut) {
        this.cod_aut = cod_aut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }
    public void addLibro(Libro libro){
        this.libros.add(libro);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
