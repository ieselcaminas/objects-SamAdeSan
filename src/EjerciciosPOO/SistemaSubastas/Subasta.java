package EjerciciosPOO.SistemaSubastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private int id_sub;
    private String nombre;
    private List<Lote> lotes = new ArrayList<>();

    public Subasta(int id_sub, String fecha) {
        this.id_sub = id_sub;
        this.nombre = fecha;
    }

    public int getId_sub() {
        return id_sub;
    }

    public void setId_sub(int id_sub) {
        this.id_sub = id_sub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
