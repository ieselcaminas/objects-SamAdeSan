package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private int n_reg;
    private Libro libro;
    private List<Prestamo> prestamos;
    private List<Historico> historicos;

    public Ejemplar(int n_reg, Libro libro) {
        this.n_reg = n_reg;
        this.libro = libro;
        this.prestamos = new ArrayList<>();
        this.historicos = new ArrayList<>();
    }

    public int getN_reg() {
        return n_reg;
    }

    public void setN_reg(int n_reg) {
        this.n_reg = n_reg;
    }

    public Libro getLibro() {
        return libro;
    }

    public void addLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void addHistoricos(Historico historico) {
        this.historicos.add(historico);
    }

    @Override
    public String toString() {
        return this.n_reg + " - " + this.libro + " - " + this.prestamos + " - " + this.historicos;
    }
}
