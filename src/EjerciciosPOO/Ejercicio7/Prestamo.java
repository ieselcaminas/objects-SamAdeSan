package EjerciciosPOO.Ejercicio7;

import java.util.Date;

public class Prestamo {
    private Date data_p;
    private Ejemplar ejemplar;
    private Lector lector;

    public Prestamo(Date data_p, Ejemplar ejemplar, Lector lector) {
        this.data_p = data_p;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public Date getData_p() {
        return data_p;
    }

    public void setData_p(Date data_p) {
        this.data_p = data_p;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void addEjemplar(Ejemplar ejemplar) {

    }

    public Lector getLector() {
        return lector;
    }

    public void addLector(Lector lector) {
        this.lector = lector;
    }

}
