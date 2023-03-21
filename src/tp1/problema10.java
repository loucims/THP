package tp1;

import java.util.Scanner;

public class problema10 {

    static float porcentaje_de(float total, float numero) {
        return (numero / total) * 100;

    }


    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce en el siguiente orden: nombre capital ");

        System.out.print("Persona 1: ");
        String[] persona1 = scanner.nextLine().split(" ");
        int capital1 = Integer.parseInt(persona1[1]);
        System.out.print("Persona 2: ");
        String[] persona2 = scanner.nextLine().split(" ");
        int capital2 = Integer.parseInt(persona2[1]);
        System.out.print("Persona 3: ");
        String[] persona3 = scanner.nextLine().split(" ");
        int capital3 = Integer.parseInt(persona3[1]);
        System.out.println();
        int total = capital1 + capital2 + capital3;


        System.out.println("El porcentaje dado por " + persona1[0] + " es: " + porcentaje_de(total, capital1) + "%");
        System.out.println("El porcentaje dado por " + persona2[0] + " es: " + porcentaje_de(total, capital2) + "%");
        System.out.println("El porcentaje dado por " + persona3[0] + " es: " + porcentaje_de(total, capital3) + "%");

    }
}
