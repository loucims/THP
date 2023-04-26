package tp1;

import java.util.Scanner;

public class problema2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Primera nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Segunda nota: ");
        float nota2 = scanner.nextInt();
        System.out.print("Tercera nota: ");
        float nota3 = scanner.nextInt();
        System.out.println();


        System.out.println("La nota promedio es: " + (nota1 + nota2 + nota3) / 3);
    }
    
}
