package TrabajoPractico3_Punto1;
import java.util.ArrayList;
import java.util.List;
public class Grupo {
    private String curso;
    private char letra;
    private List<Alumno> alumnos;
    private List<Asignatura> asignaturas;

    public Grupo(String curso, char letra, List<Alumno> alumnos, List<Asignatura> asignaturas) {
        this.curso = curso;
        this.letra = letra;
        this.alumnos = alumnos;
        this.asignaturas = asignaturas;
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
        alumno.agregarGrupo(this); //agregar el grupo al alumno
    }

    public void agregaraAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public List<Alumno> gnaturasetAlumnos() {
        return alumnos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
