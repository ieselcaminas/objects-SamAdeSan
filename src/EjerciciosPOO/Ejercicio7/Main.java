package EjerciciosPOO.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor(1, "JK Rowling");

        Tema tema = new Tema(1, "Fantasia");

        Editorial editorial = new Editorial(1, "Original");

        Libro libro = new Libro(1, "Harry Potter", editorial);
            editorial.addLibro(libro);
            autor.addLibro(libro);
            libro.addAutor(autor);
            libro.addTema(tema);

            Ejemplar HP1 = new Ejemplar(1, libro);
            Ejemplar HP2 = new Ejemplar(2, libro);
                libro.addEjemplar(HP1);
                libro.addEjemplar(HP2);

        Lector lector = new Lector(1, "Samuel");
        lector.addEjemplar(HP1);

        Historico historico = new Historico(1, lector, HP1, "hoy", "mañana");

        for (Libro libro1 : autor.getLibros()){
            System.out.println(libro1.getNombre());
            for (Autor autor1 : libro1.getAutores()){
                System.out.println("\t" + autor1.getNombre());
                Editorial editorial1 = libro1.getEditorial();
                System.out.println("\t" + editorial1.getNombre());
                for (Tema tema1 : libro1.getTemas()){
                    System.out.println("\t" + tema1.getNombre());
                }
            }
            for (Ejemplar ejemplar : lector.getEjemplares()){
                System.out.println(lector.getNombre());
                System.out.println("\t" + ejemplar.getLibro().getNombre());
            }
        }
    }
}
