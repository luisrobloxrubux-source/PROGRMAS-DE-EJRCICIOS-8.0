import java.util.Scanner;

public class NegativoBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Número negativo encontrado. Fin.");
                break;
            }

            System.out.println("Número: " + num);
        }
    }
}