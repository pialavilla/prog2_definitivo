package TrabajoPractico2_Punto1;

public class Pez extends Animal{
    private String species;
    private String colour;

    public Pez(String name, int age, String animalType, double price, String species, String colour) {
        super(name, age, "Pez", price);
        this.species = species;
        this.colour = colour;
    }
}
