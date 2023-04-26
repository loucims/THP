package tp1;

import java.util.Scanner;

public class problema9 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Angulo 1: ");
        float angulo1 = scanner.nextFloat();
        System.out.print("Angulo 2: ");
        float angulo2 = scanner.nextFloat();
        System.out.println("Angulo 3: " + (180 - angulo1 - angulo2));
    }
}
