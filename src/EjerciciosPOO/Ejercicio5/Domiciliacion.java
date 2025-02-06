package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Domiciliacion {
    private int num_d;
    private String nombre;
    private List<CuentaCorriente> cuentaCorriente;

    public Domiciliacion(int num_d, String nombre) {
        this.num_d = num_d;
        this.nombre = nombre;
        this.cuentaCorriente = new ArrayList<>();
    }

    public int getNum_d() {
        return num_d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<CuentaCorriente> getCuentaCorriente() {
        return cuentaCorriente;
    }
    public void addCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente.add(cuentaCorriente);
    }

    @Override
    public String toString() {
        return this.num_d + " - " + this.nombre;
    }
}
