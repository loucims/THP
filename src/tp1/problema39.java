package tp1;

import java.util.Scanner;

public class problema39 {
    public static Scanner scanner = new Scanner(System.in);

    public static int calcularPuntaje(int distanciaAlCentro){
        if(distanciaAlCentro == 0) {tirosAlBlanco++; return 500;}
        if(distanciaAlCentro <= 10) {return 250;}
        if(distanciaAlCentro <= 50) {return 100;}
        return 0;
    }

    public static int tirosAlBlanco = 0;

    public static void main(String[] args) {
        System.out.print("Introducir cantidad de jugadores: ");
        int cantidadJugadores = scanner.nextInt();
        if (cantidadJugadores <= 1) {return;}

        String nombreMVP = "";
        int puntajeMVP = 0;

        for(int turno=0; turno < cantidadJugadores; turno++){
            System.out.println("");
            System.out.print("Introducir nombre del jugador: ");
            String nombreJugador = scanner.next();

            int puntajeTotal = 0; 
            int distanciaAlCentro;
            for(int i=0;i<3;i++){
                System.out.print("Introducir distancia de tiro " + (i+1) + ": ");
                distanciaAlCentro = scanner.nextInt();
                puntajeTotal += calcularPuntaje(distanciaAlCentro);
            }
            if (puntajeTotal > puntajeMVP){
                puntajeMVP = puntajeTotal;
                nombreMVP = nombreJugador;
            }
        }

        System.out.println("");
        System.out.println("El jugador con mayor puntaje es: " + nombreMVP);
        System.out.println("Con un puntaje de: " + puntajeMVP);
        System.out.println("Y hubieron " + tirosAlBlanco + " tiros al blanco.");
    }

}
