package tp1;

import java.util.Scanner;

public class problema4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Valor de una hora: ");
        float valorHora = scanner.nextFloat();
        System.out.print("Horas por dia: ");
        float horasDia = scanner.nextFloat();
        System.out.println();


        System.out.println("El sueldo semanal es: " + (valorHora * horasDia) * 5.5);
    }
    
    
}
