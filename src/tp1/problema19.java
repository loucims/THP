package tp1;

import java.util.Scanner;

public class problema19 {
    
    public static Scanner scanner = new Scanner(System.in);

    static boolean esImpar(int numero) {
        return numero % 2 != 0;
    }
    static boolean esDeUnSoloDigito(int numero) {
        return numero >= 0 && numero < 10;
    }

    static boolean estaEnAmbosGrupos(int numero) {
        return esImpar(numero) && esDeUnSoloDigito(numero);
    }

    static boolean noEstaEnNingunGrupo(int numero) {
        return !esImpar(numero) && !esDeUnSoloDigito(numero);
    }

    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.println("");
        System.out.println("Es impar: " + esImpar(numero));
        System.out.println("Es de un solo digito: " + esDeUnSoloDigito(numero));
        System.out.println("Esta en ambos grupos: " + estaEnAmbosGrupos(numero));
        System.out.println("No esta en ningun grupo: " + noEstaEnNingunGrupo(numero));
    }
}
