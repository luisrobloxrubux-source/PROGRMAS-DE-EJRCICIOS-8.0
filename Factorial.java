import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Validación: El factorial no está definido para números negativos
        if (n < 0) {
            System.out.println("El factorial no existe para números negativos.");
        } else {
            long factorial = 1; // Usamos long para evitar desbordamiento rápido
            int original = n;   // Guardamos el valor original para el mensaje final

            while (n > 0) {
                factorial *= n;
                n--;
            }

            System.out.println("Factorial de " + original + ": " + factorial);
        }
        
        sc.close();
    }
}
