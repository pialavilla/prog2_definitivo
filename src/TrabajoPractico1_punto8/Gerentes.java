package TrabajoPractico1_punto8;

public class Gerentes extends Empleado{
    private String department;

    public Gerentes(String name, int age, double wage, String department) {
        super(name, age, wage);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    // Método para organizar actividades dentro del departamento
    public void organizarActividades() {
        System.out.println("Organizando actividades en el departamento de " + department);
        // Lógica para organizar actividades
    }
    public void informacion(){
        System.out.println("informacion del Gerente: ");
        System.out.println("nombre: "+getName()+" edad: "+getAge()+ " salario: "+getWage());
    }
}
