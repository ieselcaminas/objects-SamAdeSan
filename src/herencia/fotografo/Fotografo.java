package herencia.fotografo;

public class Fotografo {
    private String nombre;
    private TomarFoto aparatoFoto;

    public Fotografo(String nombre, TomarFoto aparatoQueTomaFoto) {
        this.nombre = nombre;
        this.aparatoFoto = aparatoQueTomaFoto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TomarFoto getCamara() {
        return aparatoFoto;
    }

    public void setCamara(TomarFoto aparatoQueTomaFoto) {
        this.aparatoFoto = aparatoQueTomaFoto;
    }

    public void tomarFoto(){
        this.aparatoFoto.tomarFoto();
    }
}
