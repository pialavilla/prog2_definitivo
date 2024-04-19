package AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        // Crear universidades
        Universidad universidad1 = new Universidad("Universidad A");
        Universidad universidad2 = new Universidad("Universidad B");

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Estudiante 1");
        Estudiante estudiante2 = new Estudiante("Estudiante 2");

        // Asociar estudiantes a universidades
        estudiante1.setUniversidad(universidad1);
        estudiante2.setUniversidad(universidad2);

        // Mostrar universidades de los estudiantes
        estudiante1.mostrarUniversidad();
        estudiante2.mostrarUniversidad();

        // Cambiar universidad de un estudiante
        estudiante1.setUniversidad(universidad2);
        estudiante1.mostrarUniversidad();
    }
}
