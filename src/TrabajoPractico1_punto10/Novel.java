package TrabajoPractico1_punto10;

public class Novel extends TextBook{
    private String guy;

    public Novel(String title, String author, double price, String course, String guy) {
        super(title, author, price, course);
        this.guy = guy;
    }
    @Override
    public void Showinfo(){
        super.Showinfo();
        System.out.println("tipo: "+guy);
    }
}
