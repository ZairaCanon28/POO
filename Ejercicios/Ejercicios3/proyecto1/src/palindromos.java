import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Inicializar el contador de palíndromos
            int contadorPalindromos = 0;

            // Variable para almacenar la palabra ingresada por el usuario
            String palabra;

            // Usar un ciclo do-while para seguir pidiendo palabras
            do {
                // Solicitar al usuario que ingrese una palabra
                System.out.println("Ingresa una palabra (escribe 'fin' para terminar): ");
                palabra = sc.nextLine();

                // Verificar si la palabra es un palíndromo
                if (esPalindromo(palabra) && !palabra.equalsIgnoreCase("fin")) {
                    contadorPalindromos++;
                }
            } while (!palabra.equalsIgnoreCase("fin"));

            // Mostrar el número de palabras que son palíndromos
            System.out.println("Número de palabras que son palíndromos: " + contadorPalindromos);
        }
    }

    // Método que verifica si una palabra es un palíndromo
    public static boolean esPalindromo(String palabra) {
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
