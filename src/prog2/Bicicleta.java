package prog2;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public void mostrarAtributos() {
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
