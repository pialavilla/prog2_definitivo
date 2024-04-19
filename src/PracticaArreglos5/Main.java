package PracticaArreglos5;
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
        //encontrar el mayor nro
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if ( numeros[i]> mayor ){
                mayor = numeros[i];
            }
        }
        //contar cuantas veces se repite el mayor
        int contador = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i]==mayor){
                contador++;
            }
        }
        System.out.println("El mayor numero es "+mayor+" y se repite "+contador+ " veces.");
    }
}