import java.util.Scanner;

public class ejercicioOperaciones {
    public static void main(String[] args) {
        try (// Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el primer número
            System.out.print("Por favor ingrese el primer número: ");
            int num1 = scanner.nextInt();

            // Pedir al usuario que ingrese el segundo número
            System.out.print("Por favor ingrese el segundo número: ");
            int num2 = scanner.nextInt();

        
        //Calculos 
            // Suma
            int suma = num1 + num2;
            //Resta
            int resta = num1 - num2;
            //Multiplicación
            int multipli = num1 * num2;
            //División
            int division = num1 / num2;



            //Impresión de los resultados
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
            System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
            System.out.println("La Multiplcación de " + num1 + " y " + num2 + " es: " + multipli);
            System.out.println("La División de " + num1 + " y " + num2 + " es: " + division);
       

            //Primer numer mayor
            if (num1 > num2) {
                //Imprimir
                System.out.println("El primer número: " + "("+num1+")"+" Es mayor que el segundo número: " + "("+num2+")");
            } else{
                System.out.println("¡ERROR!, El Segundo número: " + "("+num2+")"+" Es mayor o igual que el primer número: " + "("+num1+")");
            }
            //Dos números positivos
            if (num1>0 && num2>0) {
                //imprimir
                System.out.println("Los dos números son positvos.");
            } else{
                System.out.println("¡ERROR!, al menos un número en negativo.");
            }

        }

    }
}