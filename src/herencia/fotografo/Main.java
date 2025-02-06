package herencia.fotografo;

public class Main {
    public static void main(String[] args) {
        Camara camara = new Camara("Canon");
        Fotografo pepe = new Fotografo("Victor", camara);
        pepe.tomarFoto();

        Movil movil = new Movil("Samsung");
        Fotografo juan = new Fotografo("Antonio", movil);
        juan.tomarFoto();

        GoPro goPro = new GoPro("modeloGoPro");
        Fotografo andres = new Fotografo("Samuel", goPro);
        andres.tomarFoto();

    }
}
