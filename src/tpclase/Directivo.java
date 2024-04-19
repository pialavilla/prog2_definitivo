package tpclase;

public class Directivo extends Empleado{
    private String  departamento;

    public Directivo() {
    }

    public Directivo(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    public String getdepartamento() {
        return departamento;
    }

    public void setdepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "";
    }
}
