package Animales;

public class Gato extends Animal{
    private String color;

    public Gato(String nombre, int edad, String genero, String color) {
        super(nombre, edad, genero);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método hacer_sonido específico para gato
    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
    @Override
    public void informacion(){
        System.out.println("el gato se llama: "+getNombre()+", tiene: "+getEdad()+" años, es : "+getGenero()+ ", es de color: "+color);
    }
}
