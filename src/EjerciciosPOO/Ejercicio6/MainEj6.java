package EjerciciosPOO.Ejercicio6;

public class MainEj6 {
    public static void main(String[] args) {
        AreaC instituto = new AreaC(123, "IES ElCaminàs");

            Departamento departamento1 = new Departamento(1, "Informática", instituto);

                Facultad facultad1 = new Facultad(11, "Programación");

                    Profesor profesor1 = new Profesor(12345, "Victor", "Ponz", "Artero", 48, departamento1);
                    Catedra catedra1 = new Catedra(31, "CatCaminas1", departamento1, facultad1, profesor1);
                    profesor1.addCatedra(catedra1);

                Facultad facultad2 = new Facultad(21, "Bases de Datos");
                    Profesor profesor2 = new Profesor(54321, "Alicia", "Salvador", "Contreras", 51, departamento1);
                    Catedra catedra2 = new Catedra(32, "CatCaminas2", departamento1, facultad2, profesor2);
                    profesor2.addCatedra(catedra2);

            Departamento departamento2 = new Departamento(2, "Mantenimiento", instituto);

    }
}
