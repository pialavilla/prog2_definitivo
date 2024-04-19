package prog2;
import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Vehiculo coche1 = new Coche("rojo", 4, 120);
        Vehiculo vehiculo1 = new Vehiculo("azul", 4);
        Vehiculo bicicleta1 = new Bicicleta("negro", 2, "urbana");
        Vehiculo motocicleta1 = new Motocicleta("amarillo", 4, 160);
        Vehiculo camioneta1 = new Camioneta("marron", 4, 70);

        // Añadir los objetos a la lista vehiculos

        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(coche1);
        vehiculos.add(vehiculo1);
        vehiculos.add(motocicleta1);
        vehiculos.add(camioneta1);
        vehiculos.add(bicicleta1);

        // Llamar a la función catalogar
        Catalogador.catalogar(vehiculos);

       //mostrar vehiculos con 0 ruedas
        Catalogador.catalogar(vehiculos,0);

        Catalogador.catalogar(vehiculos,2);
        Catalogador.catalogar(vehiculos,4);

    }
}
