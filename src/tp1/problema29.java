package tp1;

import java.util.Scanner;

public class problema29 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;
        do {
            System.out.print("Introduce un numero entre 0 y 10: ");
            numero = scanner.nextInt();
        } while (numero < 0 || numero > 10);
        
        System.out.println("Numero correcto.");

    }
}
