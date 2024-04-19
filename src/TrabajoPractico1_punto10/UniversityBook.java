package TrabajoPractico1_punto10;

public class UniversityBook extends TextBook{
    private String faculty;

    public UniversityBook(String title, String author, double price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }
    @Override
    public void Showinfo(){
        super.Showinfo();
        System.out.println("facultad: "+faculty);
    }
}
