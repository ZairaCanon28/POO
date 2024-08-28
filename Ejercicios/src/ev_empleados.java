import java.util.Scanner;

public class ev_empleados {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            // Pedir al usuario que introduzca su puntuación
            System.out.print("Introduce tu puntuación: ");
            double puntuacion = sc.nextDouble();

            // Inicializar variables para el nivel de rendimiento y el dinero recibido
            String nivelRendimiento;
            double dinero = 0.0;
            double salarioBase = 10000.0;

            // Determinar el nivel de rendimiento y el dinero recibido según la puntuación
            if (puntuacion == 0.0) {
                nivelRendimiento = "Inaceptable";
                dinero = salarioBase * puntuacion;
            } else if (puntuacion == 0.4) {
                nivelRendimiento = "Aceptable";
                dinero = salarioBase * puntuacion;
            } else if (puntuacion >= 0.6) {
                nivelRendimiento = "Meritorio";
                dinero = salarioBase * puntuacion;
            } else {
                nivelRendimiento = "Puntuación no válida";
            }

            // Mostrar el resultado
            if (!nivelRendimiento.equals("Puntuación no válida")) {
                System.out.println("Tu nivel de rendimiento es: " + nivelRendimiento);
                System.out.println("La cantidad de dinero que recibirás es: $" + dinero);
            } else {
                System.out.println("Puntuación no es válida:");
            }
        }
    }
}
