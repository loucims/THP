package tp1;

import java.util.Scanner;

public class problema25 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce altura: ");
        int altura = scanner.nextInt();
        System.out.print("Introduce ancho: ");
        int ancho = scanner.nextInt();

        for(int lineas=1; lineas <= altura; lineas++){
            for(int caracter=0; caracter < ancho; caracter++){
                System.out.print(" X ");
            }
            System.out.println("");
        }
    }

}
