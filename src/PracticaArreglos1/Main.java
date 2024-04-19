package PracticaArreglos1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //crear un arreglo para almacenar los 10 enteros
        int[] enteros = new int[10];
        //leer los 10 enteros y almacenarlos en el arreglo
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el entero #"+(i + 1)+": ");
            enteros[i] = scanner.nextInt();
        }
        //Determinar la posicion del mayor numero leido
        int mayor = enteros[0];
        int posicion = 0;
        for (int i = 1; i < 10 ; i++) {
            if (enteros[i]>mayor){
                mayor = enteros[i];
                posicion = i;
            }
        }
        System.out.println("El mayor numero leido es: "+mayor+", y se encuentra en la posicion: "+(posicion+1)+" del arreglo");
    }
}


























