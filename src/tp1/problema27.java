package tp1;

import java.util.Scanner;
import java.util.ArrayList;

public class problema27 {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Introduce cinco numeros: ");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0; i<5; i++){
            numbers.add(scanner.nextInt());
        }

        int total = 0;
        int totalImpares = 0;
        for (int num : numbers) {
            total += num;
            if (num % 2 != 0 && num > 18){
                totalImpares += 1;
            }
        }
        
        System.out.println("El promedio es: " + (float)total/5);
        System.out.println("La cantidad de numeros impares mayores de 18 es de: " + totalImpares);
        
    }

}
