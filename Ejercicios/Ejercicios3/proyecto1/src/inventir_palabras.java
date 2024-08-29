import java.util.Scanner;

public class inventir_palabras {
    public static void main(String[] arg){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Ingresa una oración: ");//Soliciar la usuario la oracion
            String oracion1 = sc.nextLine();

            // Separar la oración en palabras utilizando el método split()
            String[] sep_palabras = oracion1.split(" ");

            // Recorrer cada palabra en el arreglo
            for (int i = 0; i < sep_palabras.length; i++) {
                String palabra = sep_palabras[i];
                String palabraInvertida = "";
            
                // Invertir la palabra utilizando un ciclo
                for (int j = palabra.length() - 1; j >= 0; j--) {
                    palabraInvertida += palabra.charAt(j);
                }
                
                sep_palabras[i] = palabraInvertida;
            }

                // Unir las palabras invertidas en una sola oración
                String oracionInvertida = String.join(" ", sep_palabras);

                // Mostrar la oración con las palabras invertidas
                System.out.println("Oración con palabras invertidas: " + oracionInvertida);
            }
        }
    }    

