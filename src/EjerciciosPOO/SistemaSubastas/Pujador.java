package EjerciciosPOO.SistemaSubastas;

public class Pujador {
    private int n_pujador;
    private String nombre;

    public Pujador(int n_pujador, String nombre) {
        this.n_pujador = n_pujador;
        this.nombre = nombre;
    }

    public int getN_pujador() {
        return n_pujador;
    }

    public void setN_pujador(int n_pujador) {
        this.n_pujador = n_pujador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
