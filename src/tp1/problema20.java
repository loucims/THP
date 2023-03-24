package tp1;

import java.util.Scanner;

public class problema20 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("");
        System.out.print("Introduce comando: ");
        String comando = scanner.next();

        switch(comando){
            case "x":
                System.out.println("El resultado es: " + (numero * numero2));
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Math ERROR");
                    break;
                }

                System.out.println("El resultado es: " + (numero / numero2));
                break;
            case "+":       
                System.out.println("El resultado es: " + (numero + numero2));
                break;
            case "-":
                System.out.println("El resultado es: " + (numero - numero2));
                break;
        }

    }
}
