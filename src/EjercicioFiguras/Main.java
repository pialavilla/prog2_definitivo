package EjercicioFiguras;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);
        System.out.println("el area del cuadrado es: "+cuadrado1.area());
        cuadrado1.rotar();
        cuadrado1.dibujar();

        Circulo circulo1 = new Circulo(4);
        circulo1.dibujar();
    }
}
