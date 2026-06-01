import java.util.Scanner;

public class IntentosClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "1234";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento " + i + ": ");
            String clave = sc.nextLine();

            if (clave.equals(claveCorrecta)) {
                System.out.println("Acceso concedido");
                break;
            }

            if (i == 3) {
                System.out.println("Acceso bloqueado");
            }
        }
    }
}