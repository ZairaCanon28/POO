import java.util.Scanner;


public class salarioAnual {
    public static void main(String[] args){//scanner para leer los datos de entrada
        try(Scanner sc = new Scanner(System.in)){

            //Pedir datos de entrada a usuario nombre,edad y usuario
        System.out.println("Buen día");
        System.out.print("Porfavor ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Por favor ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Por favor ingrese su salario mensual: ");
        double salarioMensual = sc.nextDouble();

        //Calcular el salario
        double salarioAnual = salarioMensual * 12;

        //Resultado para imprimir
        System.out.println("Buen día "+nombre+", su edad es de: "+edad+" y su salario anual es de: "+salarioAnual);
        System.out.println("Adíos.");

        }
    }
}
