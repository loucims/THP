package tp1;

import java.util.Scanner;

public class problema05 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Primera variable: ");
        int num1 = scanner.nextInt();
        System.out.print("Segunda variable: ");
        int num2 = scanner.nextInt();
        System.out.println();
        
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Nueva primera variable: " + num1);
        System.out.println("Nueva segunda variable: " + num2);
    }


}
