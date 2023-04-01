package tp1;

import java.util.Scanner;

public class problema32 {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numero;
        do {
            System.out.print("Introduce un numero entre 0 y 10: ");
            numero = scanner.nextInt();
        } while ((numero < 4 || numero > 10) && numero != 2);
        
        System.out.println("Numero correcto.");

        
    }
    
}
