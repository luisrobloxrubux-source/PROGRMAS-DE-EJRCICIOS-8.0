import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número (0 para salir): ");
        int num = sc.nextInt();

        // Verificamos si el usuario decidió salir en el primer intento
        if (num == 0) {
            System.out.println("No se ingresaron números válidos.");
        } else {
            int menor = num;

            while (num != 0) {
                if (num < menor) {
                    menor = num;
                }
                System.out.print("Ingrese número (0 para salir): ");
                num = sc.nextInt();
            }

            System.out.println("Menor: " + menor);
        }
        
        sc.close();
    }
}
