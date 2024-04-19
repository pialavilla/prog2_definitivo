package TrabajoPractico2_Punto1;

public class Gato extends Animal{
    private String race;
    private boolean sterilized;

    public Gato(String name, int age, String animalType, double price, String race, boolean sterilized) {
        super(name, age, "gato", price);
        this.race = race;
        this.sterilized = sterilized;
    }
}
