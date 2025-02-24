package herencia.fotografo;

public class Main {
    public static void main(String[] args) {
        Camara camara = new Camara("Canon");
        Fotografo f1 = new Fotografo("Samuel", camara);
        f1.tomarFoto();

        Movil movil = new Movil("Samsung");
        Fotografo f2 = new Fotografo("Antonio", movil);
        f2.tomarFoto();

        GoPro goPro = new GoPro("123XA");
        Fotografo f3 = new Fotografo("Jose", goPro);
        f3.tomarFoto();

    }
}
