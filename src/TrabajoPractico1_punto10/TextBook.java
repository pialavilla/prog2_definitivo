package TrabajoPractico1_punto10;
public class TextBook extends Book{
    private String course;

    public TextBook(String title, String author, double price, String course) {
        super(title, author, price);
        this.course = course;
    }
    @Override
    public void Showinfo(){
        super.Showinfo();
        System.out.println("Curso: "+course);
    }
}
