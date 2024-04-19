package PracticaArreglos2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] enteros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el entero #" + (i + 1) + ": ");
            enteros[i] = scanner.nextInt();
        }
        //encontrar el mayo numero primo entre enteros
        int mayorPrimo = Integer.MIN_VALUE;
        int posicion = -1;

        for (int i = 0; i < enteros.length; i++) {
            if (esPrimo(enteros[i]) && enteros[i] > mayorPrimo) {
                mayorPrimo = enteros[i];
                posicion = i;
            }
        }

        if (posicion != -1) {
            System.out.println("El mayor numero primo leido es " + mayorPrimo + " y se encuentra en la posicion " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("No se encontro ningun numero primo en el arreglo.");
        }
    }

        //metodo para verificar si es un numero primo
        public static boolean esPrimo(int num) {
            if (num <= 1){
                return false;
            }
            for (int i=2; i <= Math.sqrt(num); i++){
                if(num%i == 0){
                    return false;
                }
            }
            return true;
        }

    }