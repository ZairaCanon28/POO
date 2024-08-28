import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        // Pedir al usuario el dividendo
        System.out.print("Introduce el dividendo: ");
        double dividendo = sc.nextDouble();

        // Pedir al usuario el divisor
        System.out.print("Introduce el divisor: ");
        double divisor = sc.nextDouble();

        // Verificar si el divisor es cero
        if (divisor == 0) {
            System.out.println("Error: El divisor no puede ser cero.");
        } else {
            // Realizar la división y mostrar el resultado
            double resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        }

        }
    }
}
