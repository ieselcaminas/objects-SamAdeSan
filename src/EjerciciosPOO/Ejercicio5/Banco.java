package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int idBanco;
    private String nombre;
    private List<Sucursal> sucursales = new ArrayList<>();

    public Banco(int n_ent, String nombre) {
        this.idBanco = n_ent;
        this.nombre = nombre;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "ID de Banco: " + this.idBanco + " - " + this.nombre + "\tSucursales: " + this.sucursales;
    }
}
