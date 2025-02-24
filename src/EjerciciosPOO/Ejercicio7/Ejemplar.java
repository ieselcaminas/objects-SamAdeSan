package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private int cod_eje;
    private Libro libro;
    private List<Lector> lectores = new ArrayList<>();

    public Ejemplar(int cod_eje, Libro libro) {
        this.cod_eje = cod_eje;
        this.libro = libro;
    }

    public int getCod_eje() {
        return cod_eje;
    }

    public void setCod_eje(int cod_eje) {
        this.cod_eje = cod_eje;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Lector> getLectores() {
        return lectores;
    }

    public void addLector(Lector lector) {
        lectores.add(lector);
    }
}
