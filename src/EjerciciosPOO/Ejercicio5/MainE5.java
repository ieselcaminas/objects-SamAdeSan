package EjerciciosPOO.Ejercicio5;

public class MainE5 {
    public static void main(String[] args) {
        Banco bbva = new Banco(1, "BBVA");
            Sucursal sucBBVA1 = new Sucursal(1, "Castellón", bbva);
                bbva.addSucursal(sucBBVA1);

            Cliente samuel = new Cliente("20973719L", "Samuel");
            Prestamo pSamuel = new Prestamo(1, 3, samuel);
            samuel.addPrestamo(pSamuel);



            Sucursal sucBBVA2 = new Sucursal(2, "Valencia", bbva);

        Banco sabadell = new Banco(2, "Sabadell");


    }
}