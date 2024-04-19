package TrabajoPractico2_Punto2;

public class Universitario extends Libro {
    private String matter;

    public Universitario(int yearOfPublication, String author, boolean lent, String title, String matter) {
        super(yearOfPublication, author, lent, title);
        this.matter = matter;
    }
}
