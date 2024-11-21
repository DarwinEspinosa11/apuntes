import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
    public static void main(String[] args) {
        
        /*1. Crear un programa que genere un número aleatorio entre 1 y 100 e indique si es
        mayor, menor o igual a 50 */

        
        // Random aleatorio= new Random();
        // int numero= 1+aleatorio.nextInt(100);
        
        // if (numero<50) {
        //     System.out.println("El numero " + numero + " aleatorio es menor a 50");
        // }
        // else if(numero>50){
        //     System.out.println("El numero " + numero + " es mayor a 50");
        // }
        // else if(numero==50){
        //     System.out.println("el numero " + numero + " es igual a 50");
        // }
        /* ------------------------------------------------------------------------------------*/

        /* 2. Escribir un programa que genere 10 números aleatorios entre 0 y 9 y los muestre en pantalla.*/

        // Random aleatorio= new Random();
        // System.out.println("Numero aleatorios generados:");
        // for(int i=0; i<10; i++){
        //    int numero= aleatorio.nextInt(10);
        //    System.out.println("los numero: " + i + "-" + numero);
        // }
       
        /*-------------------------------------------------------------------------------- */

        /* Crear un programa que simule el lanzamiento de un dado de seis caras y muestre el
        resultado.*/

        // Random dado= new Random();
        // int numero= 1+ dado.nextInt(7);
        // System.out.println("el numero del dado es: " + numero);

/*----------------------------------------------------------------------------------------- */
        /*Escribir un programa que genere un número aleatorio decimal entre 0.0 y 1.0 y lo
        muestre en pantalla. */
        // Random numero= new Random();
        // double aleatorio= (0.0)+numero.nextDouble(0.1);
        // System.out.printf("el numero es:%.3f",aleatorio);

        /*-------------------------------------------------------------------------------- */

        /* Crear un programa que genere números aleatorios hasta que obtenga un valor
        menor a 0.1, mostrando todos los números generados. */

        // Random numero= new Random();
        
        // double aleatorio;

        // System.out.println("Números aleatorios generados:");
     
        // do {
        //     aleatorio=numero.nextDouble();
        //     System.out.println(aleatorio);
            
        // } while (aleatorio>0.1);
    
        
        /*------------------------------------------------------------------------------ */
        /*. Simular el lanzamiento de una moneda (cara o cruz) utilizando un valor booleano
        aleatorio.*/

        Random moneda= new Random();
        boolean cara=moneda.nextBoolean();
        if (cara) {
            System.out.println("cara");
        }
        else{
            System.out.println("crux");
        }

        /*-------------------------------------------------------------------------- */
        /*Generar un número aleatorio entre -10 y 10 e indicar si es positivo, negativo o cero. */

        Random aleatorio= new Random();
        int numero= aleatorio.nextInt(-10,10);
        // if (numero<=0) {
        //     System.out.println("el numero: " + numero + " es negativo ");
        // }
        // else {
        //     System.out.println("El numero: " + numero + " es positivo" );
        // }
        String mensaje=(numero<=0)?"es negativo": "es positivo";
        System.out.println(mensaje);

        /*Crear un programa que genere 5 números aleatorios y calcule la suma y el promedio
        de estos números. */
        



        




    }
}
