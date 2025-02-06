package EjerciciosPOO.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private List<Tema> tema;

    public Libro(String titulo, List<Tema> tema, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Tema> getTema() {
        return tema;
    }

    public void setTema(List<Tema> tema) {
        this.tema = tema;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void addTema(){
    }
}
