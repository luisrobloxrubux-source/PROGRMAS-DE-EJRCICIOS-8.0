import java.util.Scanner;

public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        System.out.print("Ingrese número (0 para salir): ");
        int num = sc.nextInt();

        // El bucle depende directamente de la condición de parada
        while (num != 0) {
            if (num > 0) {
                contador++;
            }
            System.out.print("Ingrese número (0 para salir): ");
            num = sc.nextInt();
        }

        System.out.println("Positivos: " + contador);
        sc.close();
    }
}
