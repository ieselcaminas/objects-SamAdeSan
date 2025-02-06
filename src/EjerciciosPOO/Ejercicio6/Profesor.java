package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private int id_pr;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private List<Departamento> departamento;
    private List<Catedra> catedra;

    public Profesor(int id_pr, String nombre, String apellido1, String apellido2, int edad, Departamento departamento) {
        this.id_pr = id_pr;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.departamento = new ArrayList<>();
        this.catedra = new ArrayList<>();
    }

    public int getId_pr() {
        return id_pr;
    }

    public void setId_pr(int id_pr) {
        this.id_pr = id_pr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamento.add(departamento);
    }

    public List<Catedra> getCatedra() {
        return catedra;
    }

    public void addCatedra(Catedra catedra) {
        this.catedra.add(catedra);
    }

    @Override
    public String toString() {
        return this.id_pr + " - " + this.nombre + " - " + this.apellido1 + " " + this.apellido2 + " " + this.edad;
    }
}
