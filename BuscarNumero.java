public class BuscarNumero {
    public static void main(String[] args) {

        int[] arr = {3, 7, 12, 5, 9};
        int buscado = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscado) {
                System.out.println("Encontrado en posición: " + i);
                break;
            }
        }
    }
}