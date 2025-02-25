package herencia;

public class MainAnimal {
    public static void main(String[] args) {
//        Animal animal = new Animal("Samuel");
//        System.out.println(animal.getConcepto());
//        animal.comunicarse();

        Perro perro = new Perro("Rufo");
        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();

        Gato gato = new Gato("Mishifu");
        gato.comunicarse();
        gato.perseguirUnOvillo();
        gato.mamar();
        gato.respirar();

        Tiburon tiburon = new Tiburon("Tiburón");
        tiburon.comunicarse();
        tiburon.respirar();

        Entrenador pepe = new Entrenador("Juan");

        pepe.entrenar(gato);
        pepe.entrenar(tiburon);

        pepe.dejarEntrar(perro);
        pepe.dejarEntrar(gato);

        perro.setNombre("Pedro");
        System.out.println(perro);

    }
}
