package EjerciciosPOO.Ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Facultad universidad = new Facultad(1, "UPV");
        List<AreaConocimiento> facultad = new ArrayList<>();
        AreaConocimiento ciencia = new AreaConocimiento(1, "Ciencias");
        Catedra catCiencias = new Catedra(1, "Cátedra Ciencias", universidad);
        universidad.addCatedra(catCiencias);
            Departamento inf = new Departamento(1, "Informática", ciencia, catCiencias);
                Profesor victor = new Profesor(1, "Víctor", inf);
                inf.addProfesor(victor);
                victor.addCatedra(catCiencias);
                catCiencias.addProfesor(victor);

                Profesor ruben = new Profesor(2, "Rubén", inf);
                inf.addProfesor(ruben);
                ruben.addCatedra(catCiencias);
                catCiencias.addProfesor(ruben);

        for (AreaConocimiento area:facultad){
            for (Departamento dep: area.getDepartamentos()){
                System.out.println("\t" + dep.getNombre());
                System.out.println("\t\t" + dep.getCatedra().getNombre());
                for (Profesor p: dep.getCatedra().getProfesores()){
                    System.out.println("\t\t\t" + p.getNombre());
                }
            }
        }

    }
}
