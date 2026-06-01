import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Validamos que el número de términos sea válido
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            long a = 0, b = 1; // Usamos long para evitar desbordamiento en términos altos
            int i = 0;

            while (i < n) {
                System.out.print(a + " ");
                long temp = a + b;
                a = b;
                b = temp;
                i++;
            }
            System.out.println(); // Salto de línea al final
        }
        
        sc.close(); // Buena práctica
    }
}
