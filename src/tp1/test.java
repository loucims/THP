package tp1;

import java.util.Scanner;

public class test {

    public static Scanner scanner = new Scanner(System.in);

    static int sumarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }
    public static void main(String[] args) {

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println(sumarNumeros(num1, num2));
    }

}