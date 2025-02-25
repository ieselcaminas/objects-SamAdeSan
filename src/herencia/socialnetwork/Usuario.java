package herencia.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nickname;
    private String nombre;
    private int id;
    private List<Publicacion> publicaciones = new ArrayList<>();

    public Usuario(String nickname, String nombre, int id) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
        return this.id + " - " + this.nickname;
    }

}
