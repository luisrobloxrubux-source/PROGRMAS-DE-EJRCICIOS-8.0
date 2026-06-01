import java.util.Scanner;

public class ValidacionClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "java123";

        System.out.print("Ingrese contraseña: ");
        String clave = sc.nextLine();

        // El bucle solo se ejecuta si la contraseña ingresada es incorrecta
        while (!clave.equals(claveCorrecta)) {
            System.out.println("Incorrecta");
            System.out.print("Ingrese contraseña de nuevo: ");
            clave = sc.nextLine();
        }

        System.out.println("Acceso permitido");
        sc.close();
    }
}
