package TrabajoPractico1_punto8;

public class Trabajadores extends Empleado{
    private String area;

    public Trabajadores(String name, int age, double wage, String area) {
        super(name, age, wage);
        area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        area = area;
    }

    // Método para producir en el área asignada
    public void producirEnArea() {
        System.out.println("Produciendo en el área de " + area);
        // Lógica para producir en el área
    }
    public void informacion(){
        System.out.println("informacion del Empleado: ");
        System.out.println("nombre: "+getName()+" edad: "+getAge()+ " salario: "+getWage());
    }
}
