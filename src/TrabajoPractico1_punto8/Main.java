package TrabajoPractico1_punto8;

public class Main {
    public static void main(String[] args) {
        Gerentes gerente1 = new Gerentes("Ivan",22,2300.9,"Depto 3");
        gerente1.informacion();
        gerente1.organizarActividades();

        Trabajadores trabajador1= new Trabajadores("Carlos",21,100.7,"Area de alimentos");
        trabajador1.informacion();
        trabajador1.producirEnArea();
    }
}
