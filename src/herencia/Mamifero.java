package herencia;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar() {
        System.out.println("Cuando fui pequeño mamé.");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro aire por los pulmones");
    }

    @Override
    public void moverse(){
        System.out.println("Me muevo a 4 patas");
    }
}