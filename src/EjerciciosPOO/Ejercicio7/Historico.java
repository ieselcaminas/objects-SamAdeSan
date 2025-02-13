package EjerciciosPOO.Ejercicio7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Historico {
    private Date data_p;
    private Date data_t;
    private List<Ejemplar> ejemplares;
    private List<Lector> lectores;

    public Historico(Date data_p, Date data_t) {
        this.data_p = data_p;
        this.data_t = data_t;
        this.ejemplares = new ArrayList<>();
        this.lectores = new ArrayList<>();
    }

    public Date getData_p() {
        return data_p;
    }

    public void setData_p(Date data_p) {
        this.data_p = data_p;
    }

    public Date getData_t() {
        return data_t;
    }

    public void setData_t(Date data_t) {
        this.data_t = data_t;
    }

    public List<Ejemplar> getEjemplar() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    public List<Lector> getLector() {
        return lectores;
    }

    public void addLector(Lector lector) {
        this.lectores.add(lector);
    }

    @Override
    public String toString() {
        return this.data_p + " - " + this.data_t + " - " + this.ejemplares + " - " + this.lectores;
    }
}
