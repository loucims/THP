package tp1;

import java.util.Scanner;

public class problema16 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce cantidad de asientos: ");
        int asientos = scanner.nextInt();
        System.out.print("Introduce cantidad de inscriptos: ");
        int inscriptos = scanner.nextInt();

        if (asientos >= inscriptos) {
            System.out.println("Hay cupo");
        } else {
            System.out.println("No hay cupo, faltan " + (inscriptos - asientos) + " asientos");
        }
        
    }
}
