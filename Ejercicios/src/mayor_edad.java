import java.util.Scanner;

public class mayor_edad{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        
        //Preguntar edad al usuario
        
        System.out.print("Por favor, introduce tu edad: ");
        int edad = sc.nextInt();

        // Determinar si el usuario es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor de edad.");
        }
       }
    }
}



