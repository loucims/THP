package tp1;

import java.util.Scanner;

public class problema13 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero3 = scanner.nextInt();

        if (numero > numero2 && numero > numero3) {
            System.out.println("El numero mayor es: " + numero);
        } else if (numero2 > numero && numero2 > numero3) {
            System.out.println("El numero mayor es: " + numero2);
        } else if (numero3 > numero && numero3 > numero2) {
            System.out.println("El numero mayor es: " + numero3);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

}
