package tp1;

import java.util.Scanner;

public class problema18 {
    
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int numMayor, numMenor;

        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = scanner.nextInt();

        if (num > num2) {
            numMayor = num;
            numMenor = num2;
        } else {
            numMayor = num2;
            numMenor = num;
        }
        
        if (numMayor % numMenor == 0) {
            System.out.println("El numero " + numMenor + " es divisor de " + numMayor);
        } else {
            System.out.println("El numero " + numMenor + " no es divisor de " + numMayor);
        }
        

    }

}
