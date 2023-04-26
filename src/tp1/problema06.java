package tp1;

import java.util.Scanner;

public class problema6 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ventas totales: ");
        float ventasTotales = scanner.nextFloat();
        System.out.println();

        System.out.println("Sueldo total mas ventas: " + ((ventasTotales * 16/100) + ventasTotales + 44000));
    }

}
