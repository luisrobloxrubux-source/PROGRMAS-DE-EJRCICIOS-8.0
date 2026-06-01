import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int invertido = 0;
        int auxiliar = Math.abs(num); // Maneja el valor absoluto para el bucle

        while (auxiliar > 0) {
            invertido = invertido * 10 + auxiliar % 10;
            auxiliar /= 10;
        }

        // Si el número original era negativo, restauramos el signo
        if (num < 0) {
            invertido = -invertido;
        }

        System.out.println("Invertido: " + invertido);
        sc.close();
    }
}