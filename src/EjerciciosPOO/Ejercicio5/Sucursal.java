package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String lugar;
    private Banco banco;
    private List<Prestamo> prestamos = new ArrayList<>();
    private List<Cuenta_Corriente> cc = new ArrayList<>();

    public Sucursal(int n_suc, String lugar, Banco banco) {
        this.n_suc = n_suc;
        this.lugar = lugar;
        this.banco = banco;
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public List<Cuenta_Corriente> getCc() {
        return cc;
    }

    public void addCuenta(Cuenta_Corriente cuenta) {
        cc.add(cuenta);
    }

    @Override
    public String toString() {
        return "Sucursal: " + this.n_suc + ", " + this.lugar + ", banco: " + this.banco + "\t Prestamos " + this.prestamos;
    }
}
