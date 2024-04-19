package prog2;

public class Coche extends Vehiculo {
    private int velocidad;
    private int cilindrada;
    private Vehiculo vehiculo;

    public Coche(String color, int ruedas, int velocidad) {
        super(color, ruedas);
        this.velocidad = velocidad;
    }


    public void mostrarAtributos() {
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Cilindro: " + cilindrada);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
