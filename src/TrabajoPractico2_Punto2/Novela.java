package TrabajoPractico2_Punto2;

public class Novela extends Libro {
    private String title;

    public Novela(int yearOfPublication, String author, boolean lent, String title, String title1) {
        super(yearOfPublication, author, lent, title);
        this.title = title1;
    }
}
