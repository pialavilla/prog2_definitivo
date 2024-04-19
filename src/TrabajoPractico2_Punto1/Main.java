package TrabajoPractico2_Punto1;

public class Main {
    public static void main(String[] args) {
        // Crear una tienda
        TiendaMascotas tienda = new TiendaMascotas();

        // Crear animales de cada tipo
        Perro perro1 = new Perro("Buddy", 3, "perro", 344, "salchicha",true);
        Gato gato1 = new Gato("Chimu", 2, "gato", 540, "callejero",true);
        Ave ave1 = new Ave("Pollo", 1, "Ave", 200, "loro",true);
        Pez pez1 = new Pez("Nemo", 1, "Pez", 240, "pez payaso","azul");

        // Agregar animales a la tienda
        tienda.addAnimal(perro1);
        tienda.addAnimal(gato1);
        tienda.addAnimal(ave1);
        tienda.addAnimal(pez1);

        // Listar todos los animales
        tienda.listarAnimales();

        // Vender un animal
        tienda.venderAnimal("Chimu");

        // Alimentar un animal
        tienda.alimentarAnimal("Pollo");

        // Listar animales después de vender uno
        tienda.listarAnimales();
    }
}

