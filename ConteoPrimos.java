import java.util.Scanner;

public class ConteoPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese límite: ");
        int n = sc.nextInt(), contador = 0;

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) contador++;
        }

        System.out.println("Cantidad de primos: " + contador);
    }
}