package prog2;
import java.util.List;

class Catalogador {
    public static void catalogar(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
            System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
            System.out.println("Color: " + vehiculo.getColor());
            System.out.println("Número de ruedas: " + vehiculo.getRuedas());
            System.out.println();
        }
    }
    public static void catalogar(List<Vehiculo> vehiculos, Integer ruedas) {
        if (ruedas != null) {
            int count = 0;
            System.out.println("Se han encontrado vehículos con " + ruedas + " ruedas:");
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getRuedas() == ruedas) {
                    count++;
                    System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
                }
            }
            if (count == 0) {
                System.out.println("No se encontraron vehículos con " + ruedas + " ruedas.");
            }
        } else {
            System.out.println("Todos los vehículos:");
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println("Clase: " + vehiculo.getClass().getSimpleName());
            }
        }
    }

}
