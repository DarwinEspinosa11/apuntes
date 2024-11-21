import java.util.Scanner;

public class Bucles {
    public static void main(String[]arg){
        /*Ejercicio 1: Crea un programa en Java que muestre los números del 100 al 1. Salida: Primero
        muestra cada número en una línea y, a continuación, muéstralos en la misma línea separados
        por un espacio en blanco. */
/* 
        for (int i =1;i<=100; i++){
            System.out.println(i);
        }
        */

        /*Ejercicio 2: Crea un programa en Java que muestre los números del 1 a un número mayor
        introducido por teclado. Salida: Primero muestra cada número en una línea y, a continuación,
        muéstralos en la misma línea separados por un espacio en blanco. */
        /*
          Scanner obj3= new Scanner(System.in);

            System.out.println("introduce un numero");

            int num= obj3.nextInt();

            for(int i =1; i <= num; i++ ){
                System.out.println("el numero es " + i);
            } 
         */

            /*Ejercicio 3: Crea un programa en Java que muestre los números desde un número introducido
            por teclado hasta el 1, descendiendo de 1 en 1. Salida: Primero muestra cada número en una
            línea y, a continuación, muéstralos en la misma línea separados por un espacio en blanco */
        

            /*

            Scanner obj4= new Scanner(System.in);

            System.out.println("introduce un numero");

            int num= obj4.nextInt();

            for(int i =num; i !=0  ; i=i-1 ){                 
                System.out.println("el numero es " + i);
            
            //if (i>=0) {
            //        System.out.println("el numero es " + i);
             //   }
            
            } 

                */
            /*Ejercicio 4: Crea un programa en Java que muestre los números desde un número mayor hasta
            otro menor introducidos por teclado. Comprueba que el primer número es mayor que el
            segundo, y si no lo es, muestra un mensaje y finaliza el programa. Salida: Primero muestra cada
            número en una línea y, a continuación, muéstralos en la misma línea separados por un espacio
            en blanco */

            /*
            Scanner obj5= new Scanner(System.in);

            System.out.println("introduce un numero mayor");

            int num1= obj5.nextInt();

            
            System.out.println("introduce un numero menor");

            int num2= obj5.nextInt();


            if (num1>num2) {
                
                for(int i=num1; i != num2 ; i--){
                 
                    System.out.println("el numero es: " + i);
                }
            }

            else {
                System.out.println("error compruebalo y vuelva a intentarlo");
            }
            
           */


            /*Más ejercicios
            Ejercicio 1. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad
            de números a introducir). El programa debe informar de cuántos números
            introducidos son mayores que 0, menores que 0 e iguales a 0. */



           /*
             

             Scanner obj5 = new Scanner(System.in);

        System.out.println("Introduce el número mayor:");
        int numMayor = obj5.nextInt();

        System.out.println("Introduce el número menor:");
        int numMenor = obj5.nextInt();

        if (numMayor <= numMenor) {
            System.out.println("Error: El primer número debe ser mayor que el segundo.");
            return;
        }

        System.out.println("Números desde " + numMayor + " hasta " + numMenor + ":");

        for (int i = numMayor; i >= numMenor; i--) {
            System.out.println(i);
        }

        System.out.print("Números en la misma línea: ");
        for (int i = numMayor; i >= numMenor; i--) {
            System.out.print(i + " ");
        }
         */

              //ahora los mismo ejercicios pero con el while---------------------------------------------------------------------------------------------------------------
            


              /*Crea un programa en Java que muestre los números del 100 al 1. Salida: Primero
                muestra cada número en una línea y, a continuación, muéstralos en la misma línea separados
                por un espacio en blanco.
                */
                /*
                int numer=100;
                while (numer>=1) {
                    System.out.println(numer);
                    numer --;
                }
                 */

            /*Crea un programa en Java que muestre los números del 1 a un número mayor
            introducido por teclado. Salida: Primero muestra cada número en una línea y, a continuación,
            muéstralos en la misma línea separados por un espacio en blanco. */

            /*
            Scanner obj6 = new Scanner(System.in);

            System.out.println("Introduce el número :");
            int num = obj6.nextInt();

            int i= 1;

            while (i<=num) {
                System.out.println(i);

                i++;
            }
             */
            /* Ejercicio 3: Crea un programa en Java que muestre los números desde un número introducido
            por teclado hasta el 1, descendiendo de 1 en 1. Salida: Primero muestra cada número en una
            línea y, a continuación, muéstralos en la misma línea separados por un espacio en blanco. */
            
            /*
            Scanner obj7 = new Scanner(System.in);

            System.out.println("Introduce el número :");
            int numero = obj7.nextInt();
             int contador = numero;
             while (contador>=1) {
                System.out.println(contador);
                contador--;
             }
             */
             /* Crea un programa en Java que muestre los números desde un número mayor hasta
                otro menor introducidos por teclado. Comprueba que el primer número es mayor que el
                segundo, y si no lo es, muestra un mensaje y finaliza el programa. Salida: Primero muestra cada
                número en una línea y, a continuación, muéstralos en la misma línea separados por un espacio
                en blanco.
             */
            
                /*
             Scanner obj8 = new Scanner(System.in);

             System.out.println("Introduce el número mayor :");

             int num_mayor = obj8.nextInt();
             
             System.out.println("Introduce el número menor :");

             int num_menor = obj8.nextInt();

            
             int contador = num_mayor;

             if (num_mayor >= num_menor) {
                System.out.println("Error. el primer numero debe ser mayor ");
                return;
             }

             while (contador>=1) {
                
                System.out.println(contador);
                contador--;
             }

             
              */

             


             /*Ejercicio 4. Obtén la siguiente salida por pantalla: *
                                                                    **  
                                                                    ***
                                                                    ****
             */
                /*

             int longitud =4;
             for (int i=0; i < longitud; i++){
                for(int j=0; j<=i; j++){
                    System.out.print("*");

                }
                System.out.println();
             }
             */
/*------------------------------------------------------------------------------------------------------------------------------------------------------ */
             //ejercicios con bucleo while do while

             //Ejercicio 1: Crea un programa en Java que muestre los números del 100 al 1. Salida: Primero
            //muestra cada número en una línea y, a continuación, muéstralos en la misma línea separados
            //por un espacio en blanco
            /*
            int num = 100;
            do{
                System.out.println("-" + num);
                num--;
            } while(num>=1); */

            /*Ejercicio 2: Crea un programa en Java que muestre los números del 1 a un número mayor
            introducido por teclado. Salida: Primero muestra cada número en una línea y, a continuación,
            muéstralos en la misma línea separados por un espacio en blanco */

           /* Scanner scanner = new Scanner(System.in);

           
            System.out.println("Introduce un número mayor:");
            int numMayor = scanner.nextInt();
    
            System.out.println("Números desde 1 hasta " + numMayor + ":");
    
            for (int i = 1; i <= numMayor; i++) {
                System.out.println(i);
            }
    
            System.out.print("Números en la misma línea: ");
            for (int i = 1; i <= numMayor; i++) {
                System.out.print(i + " ");
            } */
                
            /*Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un número mayor:");
            int numMayor = scanner.nextInt();
    
            System.out.println("Números desde 1 hasta " + numMayor + ":");
    
            int i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= numMayor);
    
            System.out.print("Números en la misma línea: ");
            i = 1;
            do {
                System.out.print(i + " ");
                i++;
            } while (i <= numMayor); */
          
            /*Ejercicio 3: Crea un programa en Java que muestre los números desde un número introducido
            por teclado hasta el 1, descendiendo de 1 en 1. Salida: Primero muestra cada número en una
            línea y, a continuación, muéstralos en la misma línea separados por un espacio en blanco. */


            /*Scanner obj = new Scanner(System.in);

            System.out.println("Introduce un número :");
            int num = obj.nextInt();


            System.out.println("numeros de: " + num + "hasta:1");
            int contador =num;
            
            do{
                System.out.println(contador);
                contador--;
            }while(contador>=1); */
          
            /*
             * Ejercicio 4: Crea un programa en Java que muestre los números desde un número mayor hasta
            otro menor introducidos por teclado. Comprueba que el primer número es mayor que el
            segundo, y si no lo es, muestra un mensaje y finaliza el programa. Salida: Primero muestra cada
            número en una línea y, a continuación, muéstralos en la misma línea separados por un espacio
            en blanco.
             */

             /*Scanner obj4 = new Scanner(System.in);

             System.out.println("Introduce primer numero :");
             int nume1 = obj4.nextInt();

             System.out.println("Introduce primer segundo numero :");
             int nume2 = obj4.nextInt();

            System.out.println("el numero desde: " + nume1 + "hasta" + nume2);
            int i =nume1;
            do{
                System.out.println(i);
                i++;
            } while(i<= nume2); */

            /* Ejercicio 5: Crea un programa en Java que muestre el producto de los 10 primeros números
            impares. El resultado es 654729075. */

            /* 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 × 17 × 19 = 654729075*/

            

        /*------------------------------------------------------------------------------------------------------------------------ */

            /* Ejercicio 6: Crea un programa en Java que escriba todos los números del 100 al 0 de 7 en 7. */

        // System.out.println("numeros del 0 al 100 en 7 en 7" );
        //     for(int i=0;i<=100;i=i+7){
        //         System.out.println(i);
        //     }

            /*Ejercicio 7: Crea un programa en Java que calcule cuántos números naturales (1, 2, 3, 4...)
            debemos sumar en secuencia para obtener al menos un valor de 200000, es decir: ¿hasta qué
            valor llegará el sumatorio 1+2+3+4+5+ para que la suma alcance el valor 200000? */
        
        /*    int objetivo=200000;
            int contador=0;
            int suma=0;
            
            while (suma<objetivo) {
                
                contador++;
            //    suma += contador;
            suma = suma+ contador;

            }

            System.out.println("el numero es : " + objetivo + "y la suma de sus numeros " + contador ); */
            

            //  int objetivo=200000;
            //  int contador=0;
            //  int suma=0;

            // for(contador=1; suma<=objetivo ; contador++){
            //    suma = suma+ contador;


            // }
            // System.out.println("el numero es: " + objetivo + "y la suma de sus numeros son: " + (contador-1));
           


            /*Ejercicio 8: Crea un programa en Java que pida las edades y alturas de 5 alumnos, y muestre la
            edad y la estatura media, la cantidad de alumnos mayores de edad, y la cantidad de alumnos
            que miden más de 1.75. */


            
         /*
            Scanner obj8 = new Scanner(System.in);
            
        int sumaEdades = 0;
        double sumaAlturas = 0;
        int cantidadMayoresEdad = 0;
        int cantidadAltos = 0;

        // Pedir edades y alturas de 5 alumnos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            int edad = obj8.nextInt();
            System.out.print("Ingrese la altura del alumno " + (i + 1) + " (en metros): ");
            double altura = obj8.nextDouble();

            sumaEdades += edad;
            sumaAlturas += altura;
            if (edad >= 18) {
                cantidadMayoresEdad++;
            }
            if (altura > 1.75) {
                cantidadAltos++;
            }
        }

        // Calcular estadísticas
        double mediaEdad = (double) sumaEdades / 5;
        double mediaAltura = sumaAlturas / 5;

        // Mostrar resultados
        System.out.println("Estadísticas:");
        System.out.println("Edad media: " + mediaEdad);
        System.out.println("Altura media: " + mediaAltura);
        System.out.println("Cantidad de alumnos mayores de edad: " + cantidadMayoresEdad);
        System.out.println("Cantidad de alumnos que miden más de 1.75 metros: " + cantidadAltos);
          */


          /*Ejercicio 9: Crea un programa en Java que pida un número (que debe estar entre 0 y 10) y
        muestre la tabla de multiplicar de dicho número. */

        // Scanner obj9 = new Scanner(System.in);

    /*   
        int numero;
        do {
            System.out.print("Ingrese un número entre 0 y 10: ");
            numero = obj9.nextInt();
        } while (numero < 0 || numero > 10);

       
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
     */

        /*Ejercicio 10: Crea un programa en Java que pida un número y calcule su factorial: El factorial de
        n es el producto de todos los números enteros positivos desde n hasta 1. Por ejemplo, el
        factorial de 10 es: 10! = 1098765432*1. */

        

       /* Scanner obj10= new Scanner(System.in);

        int fac=1;
        int ultimos_digits=0;
    
        System.out.println("Ingresa un numero para sacar su factorial");
        int num = obj10.nextInt();
         
        while (num !=0)  {
            fac=fac*num;
            num--;
          
            
        
        }
        System.out.println(fac);  */


        Scanner scanner = new Scanner(System.in);

        // Pedir un número entero no negativo
        System.out.print("Ingrese un número entero no negativo: ");
        int n = scanner.nextInt();

        // Inicializar el contador de ceros finales
        int contador = 0;

        // Calcular la cantidad de ceros finales en n!
        // Contar cuántos múltiplos de 5, 25, 125, etc. hay en n
        while (n >= 5) {
            n /= 5; // Dividir n por 5
            contador += n; // Sumar el resultado al contador
        }

        // Mostrar el resultado
        System.out.println("El número de ceros al final de " + n + "! es: " + contador);








    }
}