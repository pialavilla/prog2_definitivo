package TrabajoPractico1_punto10;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java for Beginners","John Smith",200.99);
        book1.Showinfo();
        System.out.println();

        TextBook textBook1 = new TextBook("Manuelita","maria elena",300.88,"B");
        textBook1.Showinfo();
        System.out.println();

        UniversityBook universityBook1 = new UniversityBook("gardfiel","juan perez",233.00,"A","UTN");
        universityBook1.Showinfo();
        System.out.println();

        Novel novel1 = new Novel("Pride and Prejudice", "Jane Austen", 1000.99,"B","ciencia ficcion");
        novel1.Showinfo();
        System.out.println();

    }
}
