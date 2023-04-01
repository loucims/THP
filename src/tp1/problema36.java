package tp1;

import java.util.Scanner;

public class problema36 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce numeros: ");
        int numero;
        int suma = 0;
        int contador = 0;
        do {
            numero = scanner.nextInt();
            suma += numero;
            contador += 1;
        } while ((float)suma/contador < 20);

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + (float)suma/contador);
        System.out.println("La cantidad de numeros es: " + contador);
    }

}
