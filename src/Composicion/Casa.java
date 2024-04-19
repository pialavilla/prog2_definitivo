package Composicion;
import java.util.ArrayList;
import java.util.List;
public class Casa {
    private List<Puerta> puertas;

    public Casa(int cantidadPuertas, String materialPuertas) {
        puertas = new ArrayList<>();
        for (int i = 0; i < cantidadPuertas; i++) {
            puertas.add(new Puerta(materialPuertas));
        }
    }

    public List<Puerta> getPuertas() {
        return puertas;
    }
}
