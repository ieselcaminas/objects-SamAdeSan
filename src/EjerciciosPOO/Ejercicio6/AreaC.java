package EjerciciosPOO.Ejercicio6;

public class AreaC {
    private int num_ac;
    private String nombre;

    public AreaC(int num_ac, String nombre) {
        this.num_ac = num_ac;
        this.nombre = nombre;
    }

    public int getNum_ac() {
        return num_ac;
    }

    public void setNum_ac(int num_ac) {
        this.num_ac = num_ac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.num_ac + " - " + this.nombre;
    }
}
