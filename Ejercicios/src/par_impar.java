import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Introduce un número entero: ");
            int numero = sc.nextInt();

            // Determinar si el número es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        }
    }
}
