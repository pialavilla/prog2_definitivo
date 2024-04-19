package PracticaArreglos3;

public class Main {
    public static void main(String[] args) {

        //arreglo para almacenar los 10 nro primos
        int[] primos = new int[10];
        int contador = 0;// para controlar cuantos hemos encontrado

        //buscar numeros entre 100 y 300
        for (int num=100; num<=300; num++){
            if (esPrimo(num)){
                primos[contador] = num;
                contador++;
                if (contador == 10){
                    break;
                }
            }
        }
        //mostrar
        System.out.println("los 10 numeros primos entre 100 y 300 son:");
        for(int primo : primos){
            System.out.println(primo+ " ");
        }
    }
    //verifucar si es primo
    public static boolean esPrimo(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
