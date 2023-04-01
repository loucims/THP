package tp1;

import java.util.Scanner;

public class problema30 {
    public static Scanner scanner = new Scanner(System.in);

    static int sumar(int num1, int num2){
        return num1 + num2;
    }
    static int restar(int num1, int num2){
        return num1 - num2;
    }
    static float dividir(int num1, int num2){
        if (num2 == 0) {
            throw new Error("Math ERROR");
        }
        return (float) num1 / num2;
    }
    static int multiplicar(int num1, int num2){
        return num1 * num2;
    }


    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce segundo numero: ");
        int num2 = scanner.nextInt();

        char comando = 'S';
        while(comando != 'F'){
            System.out.print("Comando: ");
            comando = scanner.next().charAt(0);
            switch(comando){
                case 'x':
                    System.out.println("El resultado es: " + multiplicar(num1, num2));
                    break;
                case '/':    
                    try {
                        System.out.println("El resultado es: " + dividir(num1, num2));
                    } catch (Error e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case '+':       
                    System.out.println("El resultado es: " + sumar(num1, num2));
                    break;
                case '-':
                    System.out.println("El resultado es: " + restar(num1, num2));
                    break;
            }

        }

    }
}
