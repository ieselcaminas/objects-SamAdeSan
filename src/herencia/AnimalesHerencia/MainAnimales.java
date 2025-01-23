package herencia.AnimalesHerencia;

public class MainAnimales {
    public static void main(String[] args) {
        Animal animal = new Animal("Samuel");

        System.out.println(animal.getNombre());
        animal.comunicarse();

        System.out.println("_____________________________________________");

        Perro perro = new Perro("Rufo");
        perro.comunicarse();
        perro.traerZapatillas();

        System.out.println("_____________________________________________");

        System.out.println();

        Gato gato = new Gato("Garfield");
        gato.comunicarse();
        gato.jugarObilloLana();

        System.out.println("_____________________________________________");

        Tiburon tiburon = new Tiburon("Subnormal");
        tiburon.comunicarse();
        tiburon.perseguirPresa();

        /*PezPayaso pezPayaso = new PezPayaso("Nemo el Emo");
        pezPayaso.respirar();
        pezPayaso.moverse();*/
    }
}
