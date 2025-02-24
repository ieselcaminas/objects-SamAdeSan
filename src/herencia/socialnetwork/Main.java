package herencia.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> publicaciones = new ArrayList<>();
        List<Comentario> comentarios = new ArrayList<>();

        Usuario samu = new Usuario("ErSamu06", "Samuel Aded", 1);
        Mensaje t = new Mensaje(samu, 1, "Primer mensaje");
        publicaciones.add(t);

        Usuario jorge = new Usuario("GEorg3", "Jorge Pérez", 2);
        Fotografia f = new Fotografia(jorge, "Juego", "buscaminas.png");
        publicaciones.add(f);
        Comentario c = new Comentario(1, samu, "Que guay ;)", t);
        comentarios.add(c);
        f.addComentario(c);
        f.darLike();

        for (Publicacion p : publicaciones) {
            System.out.println(p);
            for (Comentario cc : p.getComentarios()) {
                System.out.println(cc);
            }
        }

        publicacionesDe(String.valueOf(samu),publicaciones);
    }
    private static void publicacionesDe(String nombre, List<Publicacion> listaPubicaciones){
        listaPubicaciones.stream()
                .filter((p) -> p.getUsuario().getNombre().equals(nombre))
                .forEach(System.out::println);
    }
}
