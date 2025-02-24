package EjerciciosPOO.Ejercicio3;

public class CuentaMain {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("MasterCard");
        Cuenta cuenta2 = new Cuenta("Visa", 2000);
        cuenta2.retirar(200);
        cuenta2.ingresar(1200);
        System.out.println(cuenta2.getCantidad());
    }
}
