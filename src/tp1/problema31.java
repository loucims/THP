package tp1;

import java.util.Scanner;

public class problema31 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Desea continuar? [S/N]");
        char comando;
        do {
            comando = Character.toLowerCase(scanner.next().charAt(0));
        } while(comando != 's' && comando != 'n');

        // char comando = 'x';
        // while(comando != 's' && comando != 'n'){
        //     comando = Character.toLowerCase(scanner.next().charAt(0));
        // }
    }
}
