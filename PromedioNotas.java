import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        System.out.print("Nota (-1 para salir): ");
        double nota = sc.nextDouble();

        // Controlamos el flujo usando la condición nativa del bucle
        while (nota != -1) {
            suma += nota;
            contador++;
            
            System.out.print("Nota (-1 para salir): ");
            nota = sc.nextDouble();
        }

        if (contador > 0) {
            System.out.println("Promedio: " + (suma / contador));
        } else {
            System.out.println("No hay notas");
        }
        
        sc.close();
    }
}
