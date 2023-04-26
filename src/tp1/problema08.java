package tp1;

import java.util.Scanner;

public class problema08 {
    public static Scanner scanner = new Scanner(System.in);

    static int sumar(int num1, int num2){
        return num1 + num2;
    }
    static int restar(int num1, int num2){
        return num1 - num2;
    }
    static float dividir(int num1, int num2){
        return (float) num1 / num2;
    }
    static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.print("Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Numero 2: ");
        int num2 = scanner.nextInt();
        System.out.println();


        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicacion: " + multiplicar(num1, num2));
        System.out.println("Division: " + dividir(num1, num2));
    }
}