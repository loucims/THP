package tp1;

import java.util.Scanner;

public class problema28 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce cantidad de numeros: ");
        int cantidad = scanner.nextInt();

        System.out.println("Introduce " + cantidad + " numeros: ");
        int numeroMayor = 0;
        int posicion = 0;
        for(int i=1; i <= cantidad; i++){
            int num = scanner.nextInt();
            if(num > numeroMayor){
                numeroMayor = num;
                posicion = i;
            }
        }

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("en la posicion numero " + posicion + ".");

    }
}
