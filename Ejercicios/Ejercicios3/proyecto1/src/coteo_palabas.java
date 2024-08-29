import java.util.Scanner;

public class coteo_palabas {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Por favor escriba una oración: ");
            String oracion2 = sc.nextLine();

            // Eliminar los espacios en blanco al principio y al final de la oración
            oracion2 = oracion2.trim();

            // Contar las palabras separadas por uno o más espacios
            int contadorPalabras = 0;
            boolean esPalabra = false;

            for (int i = 0; i < oracion2.length(); i++) {
                if (oracion2.charAt(i) != ' ') {
                    esPalabra = true;
                } else if (esPalabra) {
                    contadorPalabras++;
                    esPalabra = false;
                }
            }
            // Si la última palabra no fue contada
            if (esPalabra) {
                contadorPalabras++;
            }

            // Mostrar el número de palabras
            System.out.println("Número de palabras en la oración: " + contadorPalabras);

        }
    }
}
