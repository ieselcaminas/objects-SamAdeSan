package EjerciciosPOO.Ejercicio7;

public class Prestamo {
    private String fecha_p;
    private Ejemplar ejemplar;
    private Lector lector;

    public Prestamo(String fecha_p, Ejemplar ejemplar, Lector lector) {
        this.fecha_p = fecha_p;
        this.ejemplar = ejemplar;
        this.lector = lector;
    }

    public String getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }
}
