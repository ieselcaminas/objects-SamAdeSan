package EjerciciosPOO.Ejercicio7;

import java.util.List;

public class Libro {
    private String titulo;
    private String desc;
    private List<Autor> autor;

    public Libro(String titulo, String desc, List<Autor> autor) {
        this.titulo = titulo;
        this.desc = desc;
        this.autor = autor;
    }

}
