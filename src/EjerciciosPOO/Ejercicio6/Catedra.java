package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int cod_cat;
    private String nombre;
    private List<Departamento> departamento;
    private List<Facultad> facultad;
    private List<Profesor> profesor;

    public Catedra(int cod_cat, String nombre, Departamento departamento, Facultad facultad, Profesor profesor) {
        this.cod_cat = cod_cat;
        this.nombre = nombre;
        this.departamento = new ArrayList<>();
        this.facultad = new ArrayList<>();
        this.profesor = new ArrayList<>();
    }

    public int getCod_cat() {
        return cod_cat;
    }

    public void setCod_cat(int cod_cat) {
        this.cod_cat = cod_cat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamento() {
        return departamento;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamento.add(departamento);
    }

    public List<Facultad> getFacultad() {
        return facultad;
    }

    public void addFacultad(Facultad facultad) {
        this.facultad.add(facultad);
    }

    public List<Profesor> getProfesor() {
        return profesor;
    }

    public void addProfesor(Profesor profesor) {
        this.profesor.add(profesor);
    }

    @Override
    public String toString() {
        return this.cod_cat + " - " + this.nombre + " - " + this.departamento + " - " + this.facultad;
    }
}
