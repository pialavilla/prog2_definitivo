package Agregacion;
import java.util.ArrayList;
import java.util.List;
public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre() + " (" + empleado.getCargo() + ")");
        }
    }
}
