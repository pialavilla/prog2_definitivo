package tpclase;

public class Tecnico extends Operario{
    private int horasTrabajadas;

    public Tecnico() {
    }

    public Tecnico(String nombre, int dni, int horasTrabajadas) {
        super(nombre,dni);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int gethorasTrabajadas() {
        return horasTrabajadas;
    }

    public void sethorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
