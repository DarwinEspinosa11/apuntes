import java.util.Scanner;

public class Caracteres {

    // public static void main(String[] args) {
        
        // char letra ='A';

        // if (Character.isLetter(letra)) {
        //     System.out.println(letra  + " Es una letra");
        // }

        // char letraMinuscula= Character.toLowerCase(letra);
        // System.out.println("En minuscula: " + letraMinuscula);

        // if (Character.isUpperCase(letra)) {
        //     System.out.println(letra + " Es una mayuscula");
        // }


        /*Ejercicio 1. Escribe por pantalla cada carácter de una cadena, uno en cada línea
        (recorriendo carácter por carácter la cadena).
         */

        //     Scanner obj1= new Scanner(System.in);
        //     System.out.println("Introduce una letra");
        //     String texto= obj1.nextLine();
        //   ;

            
        //     for(int i=0;i<texto.length(); i++){ 

        //         System.out.println(texto.charAt(i));

        //     }
           
         

        //  String cadena="Hola Pepitp";
        // System.out.println(cadena.length());
        // System.out.println(cadena.charAt(5));
        // System.out.println();

        /*Ejercicio 3. A partir de una cadena y un carácter, devuelve cuántas veces aparece el
        carácter en la cadena */

        // Scanner obj1= new Scanner(System.in);
        //  System.out.println("Introduce una letra");
        //  String texto=obj1.nextLine();
        //  char letra = obj1.next().charAt(0);
        // int cuenta = 0;
        //     for(int i=0;i<texto.length();i++){
        //         if (texto.charAt(i)==letra) {
                    
        //             cuenta++;

        //         }

        //     }

        //         System.out.println(cuenta);
            /* Ejercicio 6. Devuelve una cadena inversa a otra que se recibe como parámetro.*/



    //         Scanner obj6= new Scanner(System.in);
    //         String texto = obj6.nextLine();
    //         String otra_cadena=Inversa(texto);
    //         System.out.println(otra_cadena);
            


    // }

    // public static String  Inversa(String cadena)
    // {
    //     String resultado="";
    //     for (int i=cadena.length()-1;i>0;i--){
    //         resultado= resultado+ cadena.charAt(i);
    //     }
    //     return resultado;
    // }

    /*Ejercicio 8. Escribe una función que devuelva una cadena convirtiendo las mayúsculas en
    minúsculas y viceversa */

        
    //   myString("JUANITO" , "  Juanito");



   // }

    // static void myString(String minuscula, String mayuscula){
    //   String texto = minuscula.toLowerCase();
    //   String texto2 = mayuscula.toUpperCase();


    
    //      System.out.println("la palabra convertida en minuscula " + texto + texto2 );

        


    // } 


    /*Ejercicio 7. A partir de una cadena y dos caracteres, sustituye la aparición del primer
    carácter en la cadena por el segundo carácter. */

        // public static String sustituirCaracter(String cadena, char caracter1, char caracter2){
        //     //Utilizar el metodo replace para sustituit el caracter
        //     return cadena.replace(caracter1, caracter2);
        // }


        // public static void main(String[] args) {
            
        //     Scanner obj7 = new Scanner(System.in);

        //     System.out.println("Ingresa una cadena: ");
        //     String cadena= obj7.nextLine();

        //     //pedir el primer caracter
        //     System.out.println("Ingrese  el primer caracter a sustituiir : ");
        //     char caracter1= obj7.next().charAt(0);

        //     // Pedir el segundo carácter
        //     System.out.print("Ingrese el segundo carácter por el que se sustituirá: ");
        //     char caracter2 = obj7.next().charAt(0);
            
        //     //Llamar a la funcion sustituir caracter y almacenar el resultado
        //     String  nuevaCadena = sustituirCaracter(cadena, caracter1, caracter2);
        //     System.out.println("la nueva cadena es: " + nuevaCadena);




            

        // }

        /*Ejercicio 12: Escribe una función que cuente cuántas vocales hay en una cadena.
         */

        //  public static  int myString(String cadena ){
        //     int contador=0;
        //     //COnvertiir la cadema a ,minuscula para faciliatar la comparacion
        //     cadena=cadena.toLowerCase();
        //     //Recorrer la cadena y contar las vocales
        //     for (int i=0; i< cadena.length();i++){
        //         char c= cadena.charAt(i);
        //         //verificar si el caracter es una vocal
        //         if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
        //             contador++;
        //         }
        //     }
            
        //     return contador; //devuelve las cantidades de vocales
        //  }

        //  public static void main(String[] args) {
            
        //     Scanner obj12= new Scanner(System.in);

        //     System.out.println("Ingrese una cadena");
        //     String cadena = obj12.nextLine();

        //     int vocales=myString(cadena);

        //     System.out.println("la cantidad de vocales en la cadena es: " + vocales);



        //  }

            /*Ejercicio 2. Verifica si una primera cadena comienza con una subcadena también pasada
            como parámetro.
            */

        //     public static void main(String[] args) {
        //      Scanner scanner = new Scanner(System.in);

        // // Pedir la cadena principal
        // System.out.print("Ingrese la cadena principal: ");
        // String cadenaPrincipal = scanner.nextLine();

        // // Pedir la subcadena
        // System.out.print("Ingrese la subcadena: ");
        // String subcadena = scanner.nextLine();

        // // Verificar si la cadena principal comienza con la subcadena
        // boolean comienzaConSubcadena = cadenaPrincipal.startsWith(subcadena);

        // // Imprimir el resultado
        // if (comienzaConSubcadena) {
        //     System.out.println("La cadena principal comienza con la subcadena.");
        // } else {
        //     System.out.println("La cadena principal NO comienza con la subcadena.");
        // }
        //     }
         
            /*-------------------------------------------------------------------------------- */

            /*Ejercicio 4. A partir de una frase pasada como parámetro, devuelve el número de palabras
            (estas estarán separadas entre sí por uno o más espacios). */


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                // Pedir la frase
                System.out.print("Ingrese una frase: ");
                String frase = scanner.nextLine();
        
                // Contar el número de palabras
                int numeroDePalabras = contarPalabras(frase);
        
                // Imprimir el resultado
                System.out.println("El número de palabras en la frase es: " + numeroDePalabras);
            }
        
            public static int contarPalabras(String frase) {
                // Verificar si la frase está vacía o es nula
                if (frase == null || frase.trim().isEmpty()) {
                    return 0; // No hay palabras
                }
        
                // Dividir la frase en palabras usando espacios como delimitador
                String[] palabras = frase.trim().split("\\s+");
        
                return palabras.length; // Devolver el número de palabras
            }


            /*Ejercicio 9. Verifica si una cadena contiene una subcadena */

            /*Ejercicio 10. Indica si la cadena de caracteres que recibe es un palíndromo. Una palabra
            palíndromo es la que se lee del mismo modo hacia delante y hacia atrás. */




                // public static void main(String[] args) {
                    
                    



                // }






}
