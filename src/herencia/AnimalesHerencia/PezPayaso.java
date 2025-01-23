package herencia.AnimalesHerencia;

public abstract class PezPayaso extends Animal {
    public PezPayaso(String nombre) {
        super(nombre);
    }
    public void respirar(){
        System.out.println("Respiro por mis branquias.");
    }
    public void moverse(){
        System.out.println("Me muevo con mis aletas.");
    }
}
