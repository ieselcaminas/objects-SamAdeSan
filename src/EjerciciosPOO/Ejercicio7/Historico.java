package EjerciciosPOO.Ejercicio7;

public class Historico {
    private int cod_h;
    private Lector lector;
    private Ejemplar ejemplar;
    private String fecha_p;
    private String fecha_d;

    public Historico(int cod_hist, Lector lector, Ejemplar ejemplar, String fecha_p, String fecha_dev) {
        this.cod_h = cod_hist;
        this.lector = lector;
        this.ejemplar = ejemplar;
        this.fecha_p = fecha_p;
        this.fecha_d = fecha_dev;
    }

    public int getCod_h() {
        return cod_h;
    }

    public Lector getLector() {
        return lector;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
}
