package Animales;

public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }

    public Perro() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra.");
    }
    @Override
    public void informacion(){
        System.out.println("el perro se llama: "+getNombre()+", tiene: "+getEdad()+" años, es : "+getGenero());
    }
}
