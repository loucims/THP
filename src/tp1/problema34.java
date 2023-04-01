package tp1;

import java.util.Scanner;

public class problema34 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float total = 0;
        int contador = 0;

        System.out.println("Introduce alturas: ");
        float altura;

        do {
            altura = scanner.nextFloat();
            total += altura;
            contador += 1;
        } while(altura != 0);

        System.out.println("La altura promedio es: " + (float)total/(contador-1));

        
    }
    
}
