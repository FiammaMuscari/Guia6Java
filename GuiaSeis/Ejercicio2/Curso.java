
import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public double calcularPromedio() {
        double totalNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            totalNotas += estudiante.getNota();
        }
        return totalNotas / estudiantes.size();
    }

    public ArrayList<Estudiante> estudiantesAprobados() {
        ArrayList<Estudiante> aprobados = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() >= 3.0) {
                aprobados.add(estudiante);
            }
        }
        return aprobados;
    }
}