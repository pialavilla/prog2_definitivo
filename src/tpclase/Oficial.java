package tpclase;

public class Oficial extends Operario {
    private int edad;

    public Oficial() {
    }

    public Oficial(String nombre,int dni, int edad) {
        super(nombre, dni);
        this.edad = edad;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "edad=" + edad +
                '}';
    }
}
