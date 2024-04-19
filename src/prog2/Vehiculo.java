package prog2;

public class Vehiculo {

    private String color;
    private int ruedas;
    private Vehiculo vehiculo;

    public Vehiculo(String color,int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void mostrarAtributos() {
        System.out.println("color: " + color);
        System.out.println("ruedas: " + ruedas);
    }
}
