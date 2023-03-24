package tp1;

import java.util.Scanner;

public class problema15 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce altura: ");
        float altura = scanner.nextFloat();

        if (edad >= 6 || altura >= 1.50) {
            System.out.println("Puede entrar");
        } else {
            System.out.println("No puede entrar");
        }
    }

}
