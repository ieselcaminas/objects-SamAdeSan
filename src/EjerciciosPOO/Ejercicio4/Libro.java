package EjerciciosPOO.Ejercicio4;

import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private List<Tema> temas;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void addTema(Tema tema) {
        this.temas.add(tema);
    }

    @Override
    public String toString() {
        return "Libro: " + this.titulo + " del autor/a: " + this.autor + ", Temas: " + this.temas;
    }
}
