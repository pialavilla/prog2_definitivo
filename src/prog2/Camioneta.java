package prog2;

public class Camioneta extends Vehiculo{
    private int carga;
    private Vehiculo vehiculo;

    public Camioneta(String color, int ruedas, int carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public void mostrarAtributos() {
        System.out.println("Carga: " + carga);
    }
}
