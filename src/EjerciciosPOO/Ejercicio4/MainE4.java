package EjerciciosPOO.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainE4 {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        Autor autor = new Autor("J.K.", "Rowling", 56);
        Tema t = new Tema("Fantasía");
        Libro l = new Libro("Harry Potter", autor);
        l.addTema(t);
        t.addLibro(l);
        libros.add(l);
        for (Libro libro : libros){
            System.out.println(libro);
            for (Tema tema : libro.getTemas() ){
                System.out.println("\t" + tema.getTipo());
            }
        }
    }
}
