package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String localizacion;
    private List<Banco> banco;
    private List<Prestamo> prestamos;

    public Sucursal(int n_suc, String localizacion, List<Banco> banco) {
        this.n_suc = n_suc;
        this.localizacion = localizacion;
        this.banco = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public List<Banco> getBanco() {
        return banco;
    }

    public void addBanco(Banco banco){
        this.banco.add(banco);
    }

    @Override
    public String toString() {
        return n_suc + " - " + localizacion;
    }
}
