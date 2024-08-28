import java.util.Scanner;

public class pizzeria {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // Preguntar al usuario si quiere una pizza vegetariana
        System.out.print("¿Quieres una pizza vegetariana? (sí/no): ");
        String tipoPizza = sc.nextLine().toLowerCase();

        // Inicializar variables para almacenar los ingredientes de la pizza
        String ingredienteElegido = "";
        String ingredientesBase = "Mozzarella, Tomate";
        boolean esVegetariana = false;

        // Mostrar el menú de ingredientes según el tipo de pizza
        if (tipoPizza.equals("sí")) {
            esVegetariana = true;
            System.out.println("Ingredientes vegetarianos disponibles:");
            System.out.println("1. Pimiento");
            System.out.println("2. Tofu");
            System.out.print("Elige un ingrediente (1 o 2): ");
            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                ingredienteElegido = "Pimiento";
            } else if (eleccion == 2) {
                ingredienteElegido = "Tofu";
            } else {
                System.out.println("Elección no válida.");
                return;
            }

        } else if (tipoPizza.equals("no")) {
            System.out.println("Ingredientes no vegetarianos disponibles:");
            System.out.println("1. Peperoni");
            System.out.println("2. Jamón");
            System.out.println("3. Salmón");
            System.out.print("Elige un ingrediente (1, 2 o 3): ");
            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                ingredienteElegido = "Peperoni";
            } else if (eleccion == 2) {
                ingredienteElegido = "Jamón";
            } else if (eleccion == 3) {
                ingredienteElegido = "Salmón";
            } else {
                System.out.println("Elección no válida.");
                return;
            }

            } else {
                System.out.println("Tipo de pizza no válido.");
                return;
            }

            // Mostrar los ingredientes de la pizza
            System.out.println("\nHas elegido una pizza " + (esVegetariana ? "vegetariana" : "no vegetariana") + ".");
            System.out.println("Ingredientes: " + ingredientesBase + ", " + ingredienteElegido);

        }
    }
}