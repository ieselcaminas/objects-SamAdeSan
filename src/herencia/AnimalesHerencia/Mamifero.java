package herencia.AnimalesHerencia;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }
    public void mamar(){
        System.out.println("Soy un mamifero porque de pequeño mamé de la tta de mi mama.");
    }
    public void respirar(){
        System.out.println("");
    }
}
