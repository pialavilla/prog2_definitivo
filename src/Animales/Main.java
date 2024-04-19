package Animales;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("chimu", 2, "macho", "blanco");
        Perro perro1 = new Perro("canela", 5, "hembra", "pichicho");
        Pajaro pajaro1 = new Pajaro("pelusin", 1, "hembra", "reina mora");

        gato1.informacion();
        gato1.hacerSonido();
        perro1.informacion();
        perro1.hacerSonido();
        pajaro1.informacion();
        pajaro1.hacerSonido();
    }
}
