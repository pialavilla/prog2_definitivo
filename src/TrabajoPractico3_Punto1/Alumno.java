package TrabajoPractico3_Punto1;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
    private List<Grupo> grupos;
    public Alumno(int dni, String nombre) {
        super(dni, nombre);
        this.grupos = new ArrayList<>();
    }
    public void agregarGrupo(Grupo grupo){
        grupos.add(grupo);
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }
}
