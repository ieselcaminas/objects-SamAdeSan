package EjerciciosPOO.SistemaSubastas;

import java.util.ArrayList;
import java.util.List;

public class MainSS {
    public static void main(String[] args) {
        Subasta sub = new Subasta(12, "Caca");
        Subasta sub2 = new Subasta(21, "KaKa");

        List<Subasta> subastas = new ArrayList<>();

        subastas.add(sub);
        subastas.add(sub2);

        Lote lote1 = new Lote(1, "Lote 1");
        Articulo libro = new Articulo(1, "Libro", 100, lote1);
        Articulo ipad = new Articulo(2, "iPad", 500, lote1);

        lote1.addArticulo(libro);
        lote1.addArticulo(ipad);

        Lote lote2 = new Lote(2, "Lote 2");

        Pujador pujador = new Pujador(1, "Pepe");
        Pujador pujadora = new Pujador(2, "María");

//        Puja puja = new Puja(1, 100, pujador, lote1);
    }
}
