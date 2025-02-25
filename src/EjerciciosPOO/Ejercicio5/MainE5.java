package EjerciciosPOO.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MainE5 {
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();
        Banco sabadell = new Banco(123, "Sabadell");
        bancos.add(sabadell);
            Sucursal sucursalSabadell = new Sucursal(123, "Castellón", sabadell);
            sabadell.addSucursal(sucursalSabadell);
                Cliente cliente1 = new Cliente("12345678L", "Samuel", "Aded Santafé", 19);
                Prestamo prestamo_cliente1 = new Prestamo(123, 200, cliente1, sucursalSabadell);
                    cliente1.addPrestamo(prestamo_cliente1);
                sucursalSabadell.addPrestamo(prestamo_cliente1);
        for (Banco banco : bancos) {
            System.out.println(banco);
            for (Sucursal sucursal : banco.getSucursales()) {
                System.out.println(sucursal);
            }
        }
    }
}
