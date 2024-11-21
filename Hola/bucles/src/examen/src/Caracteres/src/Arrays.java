import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*Tarea 1. Creación de un array
        Crea un programa que pida diez números reales por teclado, los almacene en un array y
        luego muestre todos sus valores */
        // double [] numero=new double[10];
        // Scanner teclado= new Scanner(System.in);
        //  for( int i=0;i<numero.length;i++){
        //     System.out.println("Introduce un numero");
        //     numero[i]=teclado.nextDouble();
        //  }
        //  System.out.println("el contenido del arrays es: ");
        //  for( int i=0;i<numero.length;i++){
        //     System.out.println(numero[i]);
           
        //  }
/*-------------------------------------------------------------------------------------------- */
         /*Crea un programa que pida al usuario un valor entero N y a continuación cree un array de
        tamaño N, que almacene en todas sus posiciones un número aleatorio entre 0 y 99, y luego
        muestre en pantalla la suma de todos los valores del array */

        // int usuario;
        // Scanner teclado= new Scanner(System.in);
        // System.out.println("Introduce un numero ");
        // usuario=teclado.nextInt();

        // int [] tamaño= new int[usuario];

        // Random aleatorio= new Random();

        // for(int i=0;i<usuario;i++){
        //     tamaño[i]=aleatorio.nextInt(100);
        //     System.out.println("Imprime los numero: " + tamaño[i]);
        // }

        // int suma=0;
        // for(int i=0;i<usuario;i++){
        //     suma= suma+ tamaño[i];
           
        // }
        // System.out.println("la suma de los arrays es: " +  suma);
        // System.out.println("echo con for each");

        // for (int i : tamaño) {
        //     System.out.println(i);
        // }



      

/*----------------------------------------------------------------------------------------- */
        /*Tarea 3. Array de enteros
        Escribe un programa en el que se definan dos arrays de 100 números enteros, uno llamado
        pares y otro impares. Inicializa el primero con los 100 primeros números pares positivos (es
        decir, pares[0] contendrá el valor 2, pares[1] contendrá el valor 4, pares[2] contendrá el
        valor 6, y así sucesivamente). Inicializa el segundo con los 100 primeros números impares
        positivos. Imprímelo en pantalla para comprobar que lo has hecho correctamente. */

        // int [] pares= new int[100];
        // int [] impares= new int[100];


        // //numero pares
        // for(int i=0;i<100 ;i++){
        //    pares[i]= (i+1) *2;
        // }

        // //numeros impares
        // for(int i=0;i<100 ;i++){
        //    impares[i]= (i*2)+(i+1);
        // }
       

        // System.out.println("Numeros impares");
        // for(int i=0; i<impares.length;i++){
        //     if(impares[i] %2==0){//Comprueba pares
        //        System.out.println(impares[i] + " "); 
        //     }
            
        // }


        // System.out.println();

        // System.out.println("Numeros pares");
        // for(int i=0; i<pares.length;i++){
        //     System.out.println(pares[i] + " ");
        // }
    
        /*Tarea 4. Array de caracteres
        Escribe un programa que cree un array con los caracteres de la ‘a’ a la ‘k’ y, a continuación,
        sustituya todas las vocales que se encuentren en el array por el carácter ‘*’.
         */

        
    //      char[] caracteres= new char[11];

    //      for(int i=0; i<caracteres.length;i++){
    //         caracteres[i]=(char) ('a' +i);
    //      }

    //      //imprime el ARRAY 
    //     for (char letra : caracteres) {
    //         System.out.print(letra + " ");
    //     }

    //     System.out.println();
    //     for(int i=0;i<caracteres.length;i++){
    //         char letra = caracteres[i];
    //         if (letra=='a'|| letra=='e' ||letra=='i' || letra=='o'|| letra =='u') {
    //                 caracteres[i]= '*';
    //         }
    //     }

    //    System.out.println("Impreso el array modificado");
    //    for (char letra : caracteres) {
    //     System.out.print(letra + " ");
    //    }

    //    System.out.println();

       /*Escribe un programa que visualice el nombre de los meses del año en español e inglés. */

    //    String [] meses = { "enero", "febrero", "marzo", "abril", "mayo","junio", "julio", "agosto", "septiembre","octubre","noviembre", "diciembre"};

    //    String[] months={"january","february","march","april","may","june","july","august","october","november","december"};

    //    for(int i=0;i<meses.length;i++){

    //     System.out.println(meses[i] + "-" + months[i]);
    //    }


    /*------------------------------------------------------------------------------------------------------------------------------------------- */

       /* Tarea 6. Comprobación DNI
        Se debe crear un programa que indique si el DNI de un usuario es correcto o no. Para ello,
        se le solicitará al usuario la introducción del DNI, introducirá el número y la letra de forma
        separada. Una vez introducidos los datos, deberá comprobar si es correcto o no. Esta
        comprobación deberá realizarse en un método, al que se le pasará el número y la letra, y
        devolverá un valor booleano.
        Para comprobar que un DNI es correcto, existe un método que sigue los siguientes pasos:
        1. Dividir el número de DNI entre 23.
        2. El resto de la división debe estar entre 0 y 22.
        3. Obtener de una tabla específica la letra que ocupa la posición obtenida en la
        operación anterior.
        4. Si la letra obtenida es igual a la introducida por el usuario, se puede decir que el DNI
        introducido por el usuario es correcto.*/


    //  public static void main(String[] args) {
    //     Scanner teclado= new Scanner(System.in);

    //    String[]array_dni= new String[2];

    //    for(int i=0; i<array_dni.length;i++){
    //         System.out.println("Ingresa tu dni");
    //         array_dni[i]=teclado.nextLine();

    //    } 

    //    //imprimir 

    //    for(int i=0;i<array_dni.length;i++){
    //     System.out.println("Dni: "  + array_dni[i] +"   "+ validarDni(array_dni[i]));
    //    }
      
        

    // 
    // public static boolean validarDni(String dni){
    //     return dni.matches("^[0-9]{7,8}[A-Z]{1}$");
    // }

        /*--------------------------------------------------------------------------------------------------- */

        /*Tarea 7. Array como argumento
        Escribe un programa que sume los elementos de un array, indique cuál es el mayor y cuál
        es el menor invocando diferentes métodos. */
        int suma=0;
        int [] array_numero={1,2,3,4,5,6,7,8,9,10,11};
      
        //suma del contenido el arrays
        for(int nume:array_numero){
            suma += nume;
        }  

        //verificar cual es mayor
        
        int mayor=array_numero[0];
        for (int i : array_numero) {
            if (i > mayor) {
                mayor=i;
            }
        }

        //verificar cual es el menor

        int menor=array_numero[0];
        for (int i : array_numero) {
            if (i< menor) {
                menor=i;
            }
        }


        //Imprimir la suma de los arrays
        
        System.out.println("la suma es: " + suma );
        

        //imprimir cual es mayo de los arrays

        System.out.println("el mayo es: " + mayor);

        //imprimir cual es menor de los arrays

        System.out.println("El menor es: " + menor);

        
    }     
}
