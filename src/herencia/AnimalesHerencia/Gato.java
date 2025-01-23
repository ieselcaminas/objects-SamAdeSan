package herencia.AnimalesHerencia;

public class Gato extends Mamifero {
    public Gato(String nombre){
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("MWAU!");
    }

    public void jugarObilloLana(){
        System.out.println("Me encanta jugar con obillos");
    }
}
