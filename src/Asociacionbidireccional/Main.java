package Asociacionbidireccional;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Persona 1");
        Persona persona2 = new Persona("Persona 2");

        // Crear libros
        Libro libro1 = new Libro("Libro A");
        Libro libro2 = new Libro("Libro B");

        // Asociar libros a personas
        persona1.agregarLibro(libro1);
        persona1.agregarLibro(libro2);
        persona2.agregarLibro(libro2);

        // Mostrar libros de cada persona
        persona1.mostrarLibros();
        persona2.mostrarLibros();

        // Mostrar personas que poseen un libro en particular
        libro2.mostrarPoseedores();
    }
}
