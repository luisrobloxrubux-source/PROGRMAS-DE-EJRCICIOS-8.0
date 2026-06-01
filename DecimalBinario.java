import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Por favor, ingrese un número entero positivo.");
        } else if (num == 0) {
            System.out.println("Binario: 0");
        } else {
            String binario = "";

            while (num > 0) {
                binario = (num % 2) + binario; // Agrega el residuo al inicio
                num /= 2;
            }

            System.out.println("Binario: " + binario);
        }

        sc.close();
    }
}
