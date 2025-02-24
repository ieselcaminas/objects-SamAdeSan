package herencia.trabajador;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Samuel");
        System.out.println(tecnico);
        Oficial oficial = new Oficial("Ernesto");
        System.out.println(oficial);
        Directivo directivo = new Directivo("Víctor");
        System.out.println(directivo);

    }
}
