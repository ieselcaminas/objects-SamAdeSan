package herencia;

public class Ornitorrinco extends Mamifero implements PonerHuevos {

    Ornitorrinco(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse() {

        System.out.println("Burbujeos");

    }

    @Override
    public void ponerHuevos() {
        System.out.println("Pongo huevos");
    }
}
