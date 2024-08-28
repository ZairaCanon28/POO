import java.util.Scanner;

public class Asignacion_Grupos {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // Pedir al usuario su nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        // Pedir al usuario su sexo
        System.out.print("Introduce tu sexo (M/F): ");
        char sexo = sc.nextLine().charAt(0);

        // Convertir el nombre a mayúsculas para facilitar la comparación
        nombre = nombre.toUpperCase();

        // Determinar el grupo según el sexo y el nombre
        if ((sexo == 'F' && nombre.compareTo("M") < 0) || (sexo == 'M' && nombre.compareTo("N") > 0)) {
            System.out.println("Perteneces al grupo A.");
        } else {
            System.out.println("Perteneces al grupo B.");
        }

        }
    }
}
