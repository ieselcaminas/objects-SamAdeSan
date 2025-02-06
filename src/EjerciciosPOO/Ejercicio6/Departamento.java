package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int num_dep;
    private String nombre;
    private List<AreaC> area_c;

    public Departamento(int num_dep, String nombre, AreaC area_c) {
        this.num_dep = num_dep;
        this.nombre = nombre;
        this.area_c = new ArrayList<>();
    }

    public int getNum_dep() {
        return num_dep;
    }

    public void setNum_dep(int num_dep) {
        this.num_dep = num_dep;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<AreaC> getArea_c() {
        return area_c;
    }

    public void addArea_c(AreaC area_c) {
        this.area_c.add(area_c);
    }

    @Override
    public String toString() {
        return this.num_dep + " - " + this.nombre;
    }
}
