package tp1;

import java.util.Scanner;

public class problema17 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // int edad;
        // do {
        //     System.out.print("Introduce edad: ");
        //     edad = scanner.nextInt();
        //     if (edad < 1 || edad > 120) {
        //         System.out.println("Edad invalida");
        //     }
        // } while(edad < 1 || edad > 120);

        // String genero;
        // do {
        //     System.out.print("Introduce genero: ");
        //     genero = scanner.next();
        //     if (genero != "M" || genero != "F") {
        //         System.out.println("Genero invalido");
        //     }
        // } while(genero != "M" || genero != "F");

        System.out.print("Introduce edad: ");
        int edad = scanner.nextInt();
        if (edad < 1 || edad > 120) {System.out.println("Edad invalida"); return;}

        System.out.print("Introduce genero: ");
        String genero = scanner.next();
        if (genero != "M" || genero != "F") {System.out.println("Genero invalido"); return;}

        if (genero == "M"){
            if (edad >= 65){
                System.out.println("Puede jubilarse");
            } else {
                System.out.println("No puede jubilarse");
            }
        } else if (genero == "F") {
            if (edad >= 60){
                System.out.println("Puede jubilarse");
            } else {
                System.out.println("No puede jubilarse");
            }
        }
    }

}
