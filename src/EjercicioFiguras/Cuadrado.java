package EjercicioFiguras;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private Float lado;

    public Cuadrado() {
    }
    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area(){return lado*lado;}

    @Override
    public void rotar(){
        System.out.println("rotando el cuadrado");
        //implementacion del metodo rotar() para la interfaz rotable
    }

    @Override
    public void dibujar(){
        System.out.println("dibujando un cuadrado");
        //implementacion de metodo dibujar
    }














}
