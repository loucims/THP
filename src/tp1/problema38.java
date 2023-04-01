package tp1;

import java.util.Scanner;

public class problema38 {

    public static Scanner scanner = new Scanner(System.in);
    public final static String usuarioCargado = "admin";
    public final static String passwordCargada = "1234";

    public static void main(String[] args) {
        System.out.print("Introduce usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Introduce contraseña: ");
        String password = scanner.nextLine();

        if (usuario.equals(usuarioCargado) && password.equals(passwordCargada)) {
            
            System.out.println("Acceso Concedido"); 

        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("");
                System.out.println("Usuario o contraseña incorrectos. Intentos restantes: " + (3 - i));
                System.out.println("");
                System.out.print("Introduce usuario: ");
                usuario = scanner.nextLine();
                System.out.print("Introduce contraseña: ");
                password = scanner.nextLine();
    
                if (usuario.equals(usuarioCargado) && password.equals(passwordCargada)) {
                    System.out.println("Acceso Concedido"); 
                    return;
                } 
            }
            System.out.println("Acceso Denegado");
        }


    }


    
}
