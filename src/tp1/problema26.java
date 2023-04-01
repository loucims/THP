package tp1;

import java.util.Scanner;

public class problema26 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce numero natural: ");
        int n = scanner.nextInt();
        
        for(int i=1; i <= n; i++){
            if((i * 3) % 5 == 0) {continue;}
            System.out.println(i * 3);
        }
        
    }
}
