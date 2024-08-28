import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in)){

            String password = "Zaira1106";

            // Preguntar al usuario por la contraseña
            System.out.print("Introduce la contraseña: ");
            String contrasenaIntroducida = sc.nextLine();

            // Verificar si la contraseña coincide (ignorando mayúsculas y minúsculas)
            if (password.equalsIgnoreCase(contrasenaIntroducida)) {
                System.out.println("La contraseña es correcta.");
            } else {
                System.out.println("La contraseña es incorrecta.");
            }

        }
    }
}



