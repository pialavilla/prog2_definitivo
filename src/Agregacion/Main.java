package Agregacion;

public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado("Juan", "Gerente");
        Empleado empleado2 = new Empleado("María", "Analista");
        Empleado empleado3 = new Empleado("Pedro", "Desarrollador");

        // Crear departamento
        Departamento departamento1 = new Departamento("Ventas");
        Departamento departamento2 = new Departamento("Desarrollo");

        // Agregar empleados a los departamentos
        departamento1.agregarEmpleado(empleado1);
        departamento1.agregarEmpleado(empleado2);
        departamento2.agregarEmpleado(empleado3);

        // Mostrar empleados de cada departamento
        departamento1.mostrarEmpleados();
        departamento2.mostrarEmpleados();
    }
}
