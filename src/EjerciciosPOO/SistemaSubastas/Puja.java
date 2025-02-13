package EjerciciosPOO.SistemaSubastas;

import java.util.ArrayList;
import java.util.List;

public class Puja {
    private int n_puj;
    private int cuantia;
    private List<Puja> pujas = new ArrayList<>();
    private List<Pujador> pujadores = new ArrayList<>();

    public Puja(int n_puj, int cuantia, Puja puja, Pujador pujador) {
        this.n_puj = n_puj;
        this.cuantia = cuantia;
    }

    public int getN_puj() {
        return n_puj;
    }

    public void setN_puj(int n_puj) {
        this.n_puj = n_puj;
    }

    public int getCuantia() {
        return cuantia;
    }

    public void setCuantia(int cuantia) {
        this.cuantia = cuantia;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja) {
        pujas.add(puja);
    }

    public List<Pujador> getPujadores() {
        return pujadores;
    }

    public void addPujador(Pujador pujador) {
        pujadores.add(pujador);
    }

    @Override
    public String toString() {
        return this.n_puj + " - " + this.cuantia;
    }
}
