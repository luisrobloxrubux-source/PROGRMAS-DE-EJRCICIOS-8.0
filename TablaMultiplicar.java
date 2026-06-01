import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        int i = 1; // Inicializamos el contador fuera del bucle

        // Reemplazamos el 'for' por un 'while' controlado por el contador
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++; // Incrementamos manualmente el contador
        }

        sc.close();
    }
}
