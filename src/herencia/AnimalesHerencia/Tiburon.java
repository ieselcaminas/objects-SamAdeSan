package herencia.AnimalesHerencia;

public class Tiburon extends Animal {
    public Tiburon(String nombre){
        super(nombre);
    }
    public void comunicarse(){
        System.out.println("Me comunico arqueándome");
    }

    public void perseguirPresa(){
        System.out.println("Te voy a '¿COJER?' y te voy a matar!");
    }
    public void respirar(){
        System.out.println("Respiro por mis branquias");
    }
}
