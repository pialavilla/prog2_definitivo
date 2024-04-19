package TrabajoPractico2_Punto2;

public class Infantil extends Libro {

    private int recommendedAge;

    public Infantil(int yearOfPublication, String author, boolean lent, String title, int recommendedAge) {
        super(yearOfPublication, author, lent, title);
        this.recommendedAge = recommendedAge;
    }
}
