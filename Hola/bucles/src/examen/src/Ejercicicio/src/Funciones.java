import java.util.Scanner;

public class Funciones {


    /* Ejercicio 6: Imprimir un mensaje personalizado
    Crea un procedimiento llamado imprimirMensaje que reciba dos parámetros: el nombre
    de una persona y un mensaje. El procedimiento debe imprimir el mensaje personalizado en
    pantalla. En el método main, llama al procedimiento con diferentes nombres y mensajes. */ 


    // public static String Impimir_Mensaje(String Nombre,  String Mensaje){

        
    //     /* Mensaje = "Soy deportista";
    //      Nombre="Juanito";*/ 
    //      int n=11;
 
    //      String   frase_completa=  Nombre + " " + Mensaje+n;
    //      return frase_completa;
    //  }
 
    //  public static void main(String[] args) {
 
    //      /*Scanner obj6=new Scanner(System.in);
    //      String texto=obj6.nextLine();*/
    //      System.out.println(Impimir_Mensaje("Juanito", "Eres un grande"));
    //  }




     /*Ejercicio 7: Sumar números hasta un límite
    Crea un procedimiento llamado sumarHasta que reciba un número límite como parámetro
    y sume todos los números desde 1 hasta ese límite. Imprime el resultado de la suma.
     */
  
    // }
    // public static void main(String[] args) {

    //     Scanner scanner = new Scanner(System.in);

    //     // Pedir un número límite
    //     System.out.print("Ingrese un número límite: ");
    //     int limite = scanner.nextInt();

    //     // Llamar al procedimiento sumarHasta
    //     sumarHasta(limite);
    // }

    public static void sumarHasta(int limite) {
        // Inicializar la suma
        int suma = 0;

        // Sumar todos los números desde 1 hasta el límite
        for (int i = 1; i <= limite; i++) {
            suma += i;
        }

        // Imprimir el resultado de la suma
        System.out.println("La suma de todos los números desde 1 hasta " + limite + " es: " + suma);


    }



    /*Ejercicio 8: Contar números pares en un rango
    Enunciado: Crea una función llamada contarPares que reciba dos números como
    parámetros (inicio y fin) y cuente cuántos números pares hay entre ambos (incluyéndolos).
    Devuelve el resultado e imprímelo en el método main. */


    public static int Contar_pares(int incio, int fynal){
        int sumar=0;

        if (incio>fynal) {
            return 0;
        }

        for(int i=incio; i<=fynal;i= i++){
            
           if(i%2==0){
            
           }

        }
    }



    public static void main(String[] args) {

        
    }





}
