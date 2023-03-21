package tp1;

import java.util.Scanner;

public class problema7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Largo en metros: ");
        float largo = scanner.nextFloat();
        System.out.print("Ancho en metros: ");
        float ancho = scanner.nextFloat();
        System.out.print("Valor de m₂: ");
        float valorM2 = scanner.nextFloat();
        System.out.println();

        System.out.println("Valor del terreno: " + (largo * ancho) * valorM2);
        
        System.out.println("Cantidad de m₂ de alambre de 1m de altura: " + ((largo * 1) * 2 + (ancho * 1) * 2));
        System.out.println("Cantidad de m₂ de alambre de 2m de altura: " + ((largo * 2) * 2 + (ancho * 2) * 2));
        System.out.println("Cantidad de m₂ de alambre de 3m de altura: " + ((largo * 3) * 2 + (ancho * 3) * 2));
    }
}
