
import java.util.Scanner;


public class duplicados_delete {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Por favor escriba una oración: ");
            String oracion3 = sc.nextLine();
            
            // Eliminar los espacios en blanco al principio y al final de la oración
                oracion3 = oracion3.trim();

                // Contar las palabras separadas por uno o más espacios
                int contadorPalabras = 0;
                boolean esPalabra = false;

                for (int i = 0; i < oracion3.length(); i++) {
                    if (oracion3.charAt(i) != ' ') {
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
