package tp1;

import java.util.Scanner;

public class problema37 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce tus sueldos: ");
        
        int sueldo;
        int total = 0;
        for(int i=0; i < 12; i++){
            sueldo = scanner.nextInt();
            if(sueldo < 0) {break;}

            total += sueldo;
        }

        System.out.println("Total: " + total);
    }
    
}
