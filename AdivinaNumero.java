import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numero = rand.nextInt(100) + 1;
        int intento = -1; // Inicializado en -1 para evitar colisiones si el rango cambiara

        while (intento != numero) {
            System.out.print("Adivina (1-100): ");
            intento = sc.nextInt();

            if (intento < numero) {
                System.out.println("Más alto");
            } else if (intento > numero) {
                System.out.println("Más bajo");
            } else {
                System.out.println("¡Correcto!");
            }
        }
        
        sc.close(); // Buena práctica
    }
}
