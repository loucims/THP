package tp1;

import java.util.Scanner;

public class problema03 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Numero: ");
        float num = scanner.nextFloat();
        System.out.println();

        System.out.println("Dividido por dos: " + num / 2);
        System.out.println("Multiplicado por cinco: " + num * 5);
    }
}
