package TrabajoPractico3_Punto1;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class Profesor extends Persona{
    private String departamento;
    private List<Asignatura> asignaturas;

    public Profesor(int dni, String nombre, String departamento, List<Asignatura> asignaturas) {
        super(dni, nombre);
        this.departamento = departamento;
        this.asignaturas = asignaturas;
    }

    public void agregaraAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
