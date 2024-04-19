package prog2;

public class Motocicleta extends Vehiculo {
    private int velocidad;
    private int cilindra;
    private Vehiculo vehiculo;

    public Motocicleta(String color, int ruedas, int velocidad) {
        super(color, ruedas);
        this.velocidad = velocidad;
    }

    public void mostrarAtributos() {
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Cilindro: " + cilindra);
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindra() {
        return cilindra;
    }

    public void setCilindra(int cilindra) {
        this.cilindra = cilindra;
    }
}
