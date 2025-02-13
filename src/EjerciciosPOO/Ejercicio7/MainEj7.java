package EjerciciosPOO.Ejercicio7;

import java.util.Date;

public class MainEj7 {
    public static void main(String[] args) {
        Autor autor = new Autor(1234, "Joanne", "K.", "Rowling", 59);
            Editorial ed = new Editorial(234, "Vicens Vives");
            Tema tema = new Tema(23, "Fantasía");
            Libro libro = new Libro(97823456, "Harry Potter", "", tema, ed);
                tema.addLibro(libro);
                ed.addLibro(libro);
                autor.addLibro(libro);
            Ejemplar ej = new Ejemplar(22, libro);
                libro.addEjemplar(ej);

        Lector lector = new Lector("20973719L","Samuel", "Aded", "Santafé", 18);
            Historico h = new Historico(new Date(31/5/2006), new Date(15/5/2018));
            Prestamo p = new Prestamo(new Date(20/11/2004), ej, lector);
            p.addEjemplar(ej);
            p.addEjemplar(ej);
                lector.addPrestamo(p);
                lector.addHistorico(h);

    }
}