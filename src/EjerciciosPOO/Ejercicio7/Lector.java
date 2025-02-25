package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private int cod_lec;
    private String nombre;
    private List<Ejemplar> ejemplares = new ArrayList<>();

    public Lector(int cod_lec, String nombre) {
        this.cod_lec = cod_lec;
        this.nombre = nombre;
    }

    public int getCod_lec() {
        return cod_lec;
    }

    public void setCod_lec(int cod_lec) {
        this.cod_lec = cod_lec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar){
        this.ejemplares.add(ejemplar);
    }
    @Override
    public String toString(){
        return this.nombre;
    }
}
