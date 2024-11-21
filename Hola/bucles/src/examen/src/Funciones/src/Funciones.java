//import java.util.Scanner;

public class Funciones {

    // public static void sumar(int a, int b){
    //     System.out.println(a+b);
    // }

    
    // public static int restar(int a, int b){
        
    //     return a-b;
    // }


    // public static void main(String[] args)  {
       
    //     sumar(3,5);
    //     sumar(3,9);
    //     sumar(6,5);
        

       
    // }

/*--------------------------------------------------------------------------------------------------------------------- */
    // public static Double Calcular_Area(int radio){
    //     final double Pi=3.1416;


    //     return Pi*Math.pow(radio, 2);
    // }

    // public static void main(String[] args)  {

    //         System.out.println("Introduce un tamaño de radio");
    //     Scanner obj2 = new Scanner(System.in);
    //     int valor=obj2.nextInt();

       
    //    Double area = Calcular_Area(valor);
    //    System.out.println(area);

        

       
    // }


    /*Ejercicio 3: Determinar si un número es par o impar
    Crea una función llamada esPar que reciba un número como parámetro y devuelva true si
    el número es par, o false si es impar. Luego, en el método main, llama a la función e
    imprime el resultado con varios números de prueba.
    */


//     public static boolean esPar(int a){
//         boolean par= false;
//         if(a%2==0){
//             par= true;
//         }
//         return par;

    
//     }
    
//     public static void main(String[] args)  {
//         System.out.println("Introduce un numero para saber si es par o no");
//         Scanner obj3 = new Scanner(System.in);
//         int valor=obj3.nextInt();
//         boolean p=esPar(valor);
//         System.out.println("el numero introducido por teclado " + p);



//         System.out.println(esPar(6));
//         System.out.println(esPar(611));
//         System.out.println(esPar(8));
    

   
// }
/*------------------------------------------------------------------------------------------------- */

/*Ejercicio 4: Concatenar cadenas
Crea una función llamada concatenar que reciba dos cadenas de texto como parámetros
y devuelva una nueva cadena que sea la combinación de ambas, separadas por un
espacio. En el método main, llama a la función e imprime el resultado.
 */

// public static String Concatenar(String  Nombre, String apellido){
//     String nCompleto=Nombre+" "+apellido;
//     return nCompleto;



// }


//  public static void main(String[] args)  {
//     Scanner sc=new Scanner(System.in);
//     String e1=sc.nextLine();
//     String e2=sc.nextLine();
//     System.out.println(Concatenar(e1, e2));


   


// }

/*-------------------------------------------------------------------------------------- */

/*Ejercicio 5: Encontrar el mayor de dos números
Crea una función llamada encontrarMayor que reciba dos números enteros como
parámetros y devuelva el mayor de ellos. En el método main, llama a la función con
diferentes valores y muestra el resultado. */


  /*  
    public static int encontrarMayor(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
        
       

       
    }

    public static void main(String[] args) {

     
        // Llamadas a la función con diferentes valores
        int mayor1 = encontrarMayor(5, 10);
        System.out.println("El mayor de 5 y 10 es: " + mayor1);

        int mayor2 = encontrarMayor(-3, -7);
        System.out.println("El mayor de -3 y -7 es: " + mayor2);

        int mayor3 = encontrarMayor(20, 15);
        System.out.println("El mayor de 20 y 15 es: " + mayor3);

        int mayor4 = encontrarMayor(0, 0);
        System.out.println("El mayor de 0 y 0 es: " + mayor4);
   
    } */

    /*Ejercicio 6: Imprimir un mensaje personalizado
    Crea un procedimiento llamado imprimirMensaje que reciba dos parámetros: el nombre
    de una persona y un mensaje. El procedimiento debe imprimir el mensaje personalizado en
    pantalla. En el método main, llama al procedimiento con diferentes nombres y mensajes. */


    /*------------------------------------------------------------------------------------------------------------------------------------------------------------- */

    public static String Impimir_Mensaje(String Nombre,  String Mensaje){

        
       /* Mensaje = "Soy deportista";
        Nombre="Juanito";*/ 
        int n=11;

        String   frase_completa=  Nombre + " " + Mensaje+n;
        return frase_completa;
    }

    public static void main(String[] args) {

        /*Scanner obj6=new Scanner(System.in);
        String texto=obj6.nextLine();*/
        System.out.println(Impimir_Mensaje("Juanito", "Eres un grande"));
    }
}