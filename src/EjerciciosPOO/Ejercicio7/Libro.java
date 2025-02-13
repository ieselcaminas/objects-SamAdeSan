package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private int isbn;
    private String titulo;
    private String desc;
    private List<Autor> autores;
    private Tema tema;
    private Editorial editorial;
    private List<Ejemplar> ejemplar;

    public Libro(int isbn,String titulo, String desc, Tema tema, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.desc = desc;
        this.autores = new ArrayList<>();
        this.tema = tema;
        this.editorial = editorial;
        this.ejemplar = new ArrayList<>();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public List<Autor> getAutor() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public Tema getTema() {
        return tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplar;
    }
    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplar.add(ejemplar);
    }

    @Override
    public String toString() {
        return this.titulo + " - " + this.desc + " - " + this.autores;
    }
}
