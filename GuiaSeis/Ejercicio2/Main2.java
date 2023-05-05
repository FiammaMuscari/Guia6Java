import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.agregarEstudiante(new Estudiante("Juan", 20, 4.0));
        curso.agregarEstudiante(new Estudiante("Ana", 19, 3.5));
        curso.agregarEstudiante(new Estudiante("Pedro", 22, 2.7));
        curso.agregarEstudiante(new Estudiante("Sara", 21, 4.5));

        System.out.println("Promedio de notas: " + curso.calcularPromedio());

        ArrayList<Estudiante> aprobados = curso.estudiantesAprobados();
        System.out.println("Estudiantes aprobados:");
        for (Estudiante estudiante : aprobados) {
            System.out.println(estudiante.getNombre());
        }
    }
}