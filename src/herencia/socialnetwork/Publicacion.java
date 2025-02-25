package herencia.socialnetwork;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Publicacion {
    private Usuario usuario;
    private Date fecha;
    private int likes;
    private List<Comentario> comentarios = new ArrayList<>();

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = new Date();
        this.likes = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void darLike(){
        this.likes++;
    }

    public void quitarLike(){
        this.likes--;
    }

    public int getLikes() {
        return likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }
}
