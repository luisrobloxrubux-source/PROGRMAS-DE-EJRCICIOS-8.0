import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        int suma = 0;
        
        // Convertimos a positivo para que el bucle funcione con números negativos
        int auxiliar = Math.abs(num); 

        while (auxiliar > 0) {
            suma += auxiliar % 10;
            auxiliar /= 10;
        }

        System.out.println("Suma de dígitos: " + suma);
        sc.close(); // Buena práctica cerrar el Scanner
    }
}
