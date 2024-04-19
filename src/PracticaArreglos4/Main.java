package PracticaArreglos4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        //leer los 10 nro enteros y almacenarlos en un arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese el numero entero #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        //determinar posiciones d nro terminados en 4
        System.out.println("los numeros terminados en 4 se encuentran en las siguientes posiciones:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 4) {
                System.out.println("posicion " + (i + 1));
            }
        }
    }
}
