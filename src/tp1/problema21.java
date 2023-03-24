package tp1;

import java.util.Scanner;

public class problema21 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero < 1 || numero > 7) {System.out.println("El numero no es valido."); return;}

        System.out.println("El dia de la semana es: " + dias[numero - 1]);
    }
    
}
