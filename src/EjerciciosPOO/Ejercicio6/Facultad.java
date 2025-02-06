package EjerciciosPOO.Ejercicio6;

public class Facultad {
    private int cod_fac;
    private String nombre;

    public Facultad(int cod_fac, String nombre) {
        this.cod_fac = cod_fac;
        this.nombre = nombre;
    }

    public int getCod_fac() {
        return cod_fac;
    }

    public void setCod_fac(int cod_fac) {
        this.cod_fac = cod_fac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.cod_fac + " - " + this.nombre;
    }
}
