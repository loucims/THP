package tp1;

import java.util.Scanner;

public class problema12 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero2 = scanner.nextInt();

        if (numero > numero2) {
            System.out.println("El numero mayor es: " + numero);
        } else if (numero < numero2) {
            System.out.println("El numero mayor es: " + numero2);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

}
