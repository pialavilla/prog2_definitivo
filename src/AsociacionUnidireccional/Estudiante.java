package AsociacionUnidireccional;

public class Estudiante {
    private String nombre;
    private Universidad universidad;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void mostrarUniversidad() {
        if (universidad != null) {
            System.out.println(nombre + " asiste a la universidad " + universidad.getNombre());
        } else {
            System.out.println(nombre + " no está asociado a ninguna universidad.");
        }

    }
}