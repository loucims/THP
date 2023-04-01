package tp1;

import java.util.Scanner;

public class problema33 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce 0 si quieres terminar el programa.");
        System.out.println("Introduce numeros: ");
        int numero = scanner.nextInt(); 

        int numeroMayor = numero;
        int numeroMenor = numero;

        while(numero != 0){
            numero = scanner.nextInt();
            if (numero == 0) break;

            if (numeroMayor < numero) {
                numeroMayor = numero;
            }
            if (numeroMenor > numero) {
                numeroMenor = numero;
            }
        }

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);
    }
    
}
