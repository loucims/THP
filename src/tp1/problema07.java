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
        
        System.out.println("Cantidad de metros de alambre: " + ((largo * 2) + (ancho * 2)) * 3);
    }
}
