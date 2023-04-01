package tp1;

import java.util.Scanner;

public class problema24 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {System.out.println("Numeros invalidos."); return;}

        System.out.println("");
        System.out.println("---------- Incluyendolos --------");
        for(int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

        System.out.println("---------- Excluyendolos --------");
        for(int i = num1 + 1; i < num2; i++) {
            System.out.println(i);
        }

    }
    
}
