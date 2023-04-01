package tp1;

import java.util.Scanner;

public class problema35 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce nombre y edad: ");

        String nombre = scanner.next();
        if (nombre.equals("x")) {return;} // Si no hay nadie, terminar (no hay mas joven)

        String nombreMasJoven = nombre;
        int edad = scanner.nextInt();
        int edadMasJoven = edad;

        while(true) { //es redundante la condicion mientras haya un guardia
            nombre = scanner.next();
            if(nombre.equals("*")) {break;} // Si no hay mas nombres, terminar

            edad = scanner.nextInt();
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
                nombreMasJoven = nombre;
            }
        }
        System.out.println("El mas joven es " + nombreMasJoven + " con " + edadMasJoven + " años.");
    }
}
