package herencia.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nick;
    private String nombre;
    private int id;
    private List<Publicacion> publicaciones = new ArrayList<>();

    public Usuario(String nick, String nombre, int id) {
        this.nick = nick;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    public void addPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    @Override
    public String toString(){
        return this.id + " - " + this.nick;
    }

}
