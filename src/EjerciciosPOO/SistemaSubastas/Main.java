package EjerciciosPOO.SistemaSubastas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Subasta sub = new Subasta(1, "Subasta 1");
        Subasta sub2 = new Subasta(2, "Subasta 2");

        List<Subasta> listaSubastas = new ArrayList<>();

        listaSubastas.add(sub);
        listaSubastas.add(sub2);

        Lote lote1 = new Lote(1, "Lote 1", sub);

        sub.addLote(lote1);

        Articulo art1 = new Articulo(1, "Reloj Casio", 100, lote1);
        Articulo art2 = new Articulo(2, "Samsung ZFlip", 1000, lote1);

        lote1.addArticulo(art1);
        lote1.addArticulo(art2);


        Lote lote2 = new Lote(2, "Lote 2", sub);
        sub.addLote(lote2);

        Articulo art3 = new Articulo(3, "Teclado MSI" , 50, lote2);
        lote2.addArticulo(art3);

        Pujador p1 = new Pujador(1, "Samuel");
        Pujador p2 = new Pujador(2, "Jorge");

        Puja puja = new Puja(2, 300, p1, lote1);
        p1.addPuja(puja);
        lote1.addPuja(puja);

        puja = new Puja(4, 500, p2, lote1);
        p2.addPuja(puja);
        lote1.addPuja(puja);

    }
}
