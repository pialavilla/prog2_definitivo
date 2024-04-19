package Composicion;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear una casa con 5 puertas de madera
        Casa miCasa = new Casa(5, "madera");

        // Mostrar los materiales de las puertas de la casa
        List<Puerta> puertas = miCasa.getPuertas();
        System.out.println("Materiales de las puertas de la casa:");
        for (Puerta puerta : puertas) {
            System.out.println("- Material: " + puerta.getMaterial());
        }
    }
}
