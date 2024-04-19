package TrabajoPractico2_Punto2;

public class Main {
    public static void main(String[] args) {
        //crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //crear libros de cada clase
        Novela novela1 =new Novela(1605, "Miguel de Cervantes", false, "Don Quijote de la Mancha", "Novela de caballerías");
        Universitario universitario1 = new Universitario(2021, "John Doe", false, "Introducción a la Programación", "Ingeniería Informática");
        Infantil infantil1 = new Infantil( 2005, "J.K. Rowling", true, "Harry Potter y la piedra filosofal", 8);
        // Agregar los libros a la biblioteca
        biblioteca.addBook(novela1);
        biblioteca.addBook(universitario1);
        biblioteca.addBook(infantil1);

        // Listar libros disponibles
        biblioteca.listarLibrosDisponibles();
        // Prestar un libro
        biblioteca.borrowBook("Harry Potter y la piedra filosofal");
        biblioteca.borrowBook("Harry Potter y la piedra filosofal"); // Intentar prestar el mismo libro dos veces

        // Devolver un libro
        biblioteca.returBook("Don Quijote de la Mancha");

        // Listar libros disponibles después de prestar uno
        biblioteca.listarLibrosDisponibles();
    }
}
