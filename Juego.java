import java.util.Scanner;
import java.util.Random;

public class Juego {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean jugarDeNuevo = true;

        do {
            int numeroSecreto = aleatorio.nextInt(100) + 1;
            int intentos = 0;
            int numeroUsuario;

            System.out.println("Bienvenido al juego de adivinar el número secreto entre 1 y 100");

            do {
                System.out.println("Ingrese  número entre 1 y 100:");
                numeroUsuario = teclado.nextInt();
                intentos++;

                if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número secreto es mayor que " + numeroUsuario);
                } else if (numeroUsuario > numeroSecreto) {
                    System.out.println("El número secreto es menor que " + numeroUsuario);
                } else {
                    System.out.println("¡Felicitaciones! Adivinaste el número secreto en " + intentos + " intentos.");
                }
            } while (numeroUsuario != numeroSecreto);

            
            teclado.nextLine();

            System.out.println("¿Quieres jugar de nuevo? (s/n)");
            String respuesta = teclado.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                jugarDeNuevo = false;
            }
        } while (jugarDeNuevo);

        System.out.println("¡Gracias por jugar!");
        teclado.close();
    }
}