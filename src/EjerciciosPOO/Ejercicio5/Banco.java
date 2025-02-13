package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int n_ent;
    private String nombre;
    private List<Sucursal> sucursal;

    public Banco(int n_ent, String nombre) {
        this.n_ent = n_ent;
        this.nombre = nombre;
        this.sucursal = new ArrayList<>();
    }

    public int getN_ent() {
        return n_ent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursal.add(sucursal);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
