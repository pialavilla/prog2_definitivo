package TrabajoPractico2_Punto2;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> listBooks;

    public Biblioteca() {
        this.listBooks = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void addBook(Libro book) {
        listBooks.add(book);
        System.out.println("El libro '" + book.getTitle() + "' ha sido agregado a la biblioteca.");
    }

    // Método para listar los libros disponibles
    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro book : listBooks) {
            if (!book.isLent()) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
    // Método para prestar un libro
    public void borrowBook(String titulo) {
        for (Libro book : listBooks) {
            if (book.getTitle().equals(titulo)) {
                if (!book.isLent()) {
                    book.lend();
                    return;
                } else {
                    System.out.println("El libro '" + titulo + "' ya está prestado.");
                    return;
                }
            }
        }
        System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
    }


    // Método para devolver un libro
    public void returBook(String title) {
        for (Libro book : listBooks) {
            if (book.getTitle().equals(title)) {
                if (book.isLent()) {
                    book.retur();
                    return;
                } else {
                    System.out.println("El libro '" +title + "' no estaba prestado.");
                    return;
                }
            }
        }
        System.out.println("El libro '" + title + "' no se encuentra en la biblioteca.");
    }
}




