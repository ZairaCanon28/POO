import java.util.Scanner;

public class conta_vocales {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
                System.out.print("Por favor ingrese oración: "); //Soliciar la usuario la oracion
                String oracion =  sc.nextLine();

               oracion = oracion.toLowerCase(); //Convertir la oracion en minuscula
               

               //Contadores de vocales

               int contA = 0; 
               int contE = 0; 
               int contI = 0; 
               int contO = 0; 
               int contU = 0; 
               
               //Ciclo for para recorer la oración y hacer el conteo de las vocales

               for(int i = 0; i < oracion.length(); i++){

                char c = oracion.charAt(i);

                switch (c) {
                    case 'a':
                        contA++;
                        break;
                    case 'e':
                        contE++;
                        break;
                    case 'i':
                        contI++;
                        break;
                    case 'o':
                        contO++;
                        break;
                    case 'u':
                        contU++;
                        break;    
                    default:
                        break;
                }
            }

            //Mensajes con resultados
            System.out.println("El numero de cada Vocal para la oración: ");
            System.out.println("a: " + contA);
            System.out.println("e: " + contE);
            System.out.println("i: " + contI);
            System.out.println("o: " + contO);
            System.out.println("u: " + contU);

        }
    }
}
