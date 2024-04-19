package TrabajoPractico2_Punto2;

public class Libro implements Prestable {
    private int yearOfPublication;
    private String author;
    private boolean lent;
    private String title;

    public Libro(int yearOfPublication, String author, boolean lent, String title) {
        this.yearOfPublication = yearOfPublication;
        this.author = author;
        this.lent = lent;
        this.title = title;
    }
    // Métodos de la interfaz Prestable
    public void lend() {
        if (!lent) {
            lent = true;
            System.out.println("El libro '" + title + "' ha sido prestado.");
        } else {
            System.out.println("El libro '" + title + "' ya está prestado.");
        }
    }
    public void retur(){
        if (lent){
            lent=false;
            System.out.println("El libro '"+title+"' ha sido devuelto.");
        }else {
            System.out.println("El libro '"+title+"' no estaba prestado.");
        }
    }
    //otros metodos


    public boolean isLent() {
        return lent;
    }

    public String getTitle() {
        return title;
    }
}











