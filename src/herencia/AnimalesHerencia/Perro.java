package herencia.AnimalesHerencia;

public class Perro extends Mamifero {
    Perro(String nombre) {
        super(nombre);
    }

    public void traerZapatillas(){
        System.out.println("Toma amo, tus AirForce 350 CR7 Unlimited Ed.");
    }
    public void comunicarse(){
        System.out.println("WARF! WARF!");
    }
}
