package tp1;

import java.util.Scanner;

public class problema11 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }

}
