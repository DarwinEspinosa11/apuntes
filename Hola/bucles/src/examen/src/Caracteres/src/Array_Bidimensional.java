import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Array_Bidimensional {
    public static void main(String[] args) {
        
        // int[][] array_numero= new int[10][5];

        // Random aleatorio= new Random();
        // for(int i=0;i<array_numero.length;i++){
        //     for(int j=0;i<array_numero[i].length;i++){
        //         array_numero[i][j]=aleatorio.nextInt(10,20);
        //     }
        // }


        // // Imprimir el contenido del array
        // for (int i = 0; i < array_numero.length; i++) {
        //     for (int j = 0; j < array_numero[i].length; j++) {
        //         System.out.println("Posicion " + i + "-" + j + " = " + array_numero[i][j]);
        //     }
        // }

        /*Tarea 8. Array bidimensional (I)
        Crea un programa en el que se defina una matriz de 10x10 números enteros. Inicializa
        todos los elementos al valor -1.
         */

        // int [][] matriz= new int[10][10];


        // int [] array1={23,15,258,587,4};
        // int [] array2=array1.clone();
        // int [] array3=array1;

        // System.out.println(array1.equals(2));
        // System.out.println(array1.equals(array3));
        

        int  myarray[]= {4,45,5,4,5,458,4,89};
        Integer otroArray[]={4,6,84,87,36,4};
     
        Arrays.sort(myarray);

        for (int i : myarray) {
            System.out.println(i);
            
        }

        System.out.println("-------------------------------------------------");
        Arrays.sort(otroArray, Collections.reverseOrder());

        for (Integer integer : otroArray) {
            System.out.println(integer);
        }

        /*Un ejercio que esta abarcando todos los conceptos   */
        /*Vamos a crear un programa que realice las siguientes tareas:

        Crear un array de enteros.
        Llenar el array con un valor específico.
        Ordenar el array.
        Buscar un elemento en el array.
        Comparar dos arrays.
        Copiar el array a otro array de mayor tamaño.
        Imprimir los arrays utilizando toString. */
        
        /* // 1. Crear un array de enteros con un tamaño específico
        int[] miArray = new int[10];

        // 2. Llenar el array con un valor específico
        Arrays.fill(miArray, 5); // Llenar todo el array con el valor 5
        System.out.println("Array después de llenar: " + Arrays.toString(miArray));

        // Cambiamos algunos valores manualmente para hacer el ejercicio más interesante
        miArray[2] = 1;
        miArray[4] = 3;
        miArray[6] = 9;
        miArray[8] = 7;
        System.out.println("Array con valores cambiados: " + Arrays.toString(miArray));

        // 3. Ordenar el array
        Arrays.sort(miArray);
        System.out.println("Array ordenado: " + Arrays.toString(miArray));

        // 4. Buscar un elemento en el array
        int buscar = 3;
        int indice = Arrays.binarySearch(miArray, buscar);
        System.out.println("Índice de " + buscar + ": " + (indice >= 0 ? indice : "No encontrado"));

        // 5. Comparar dos arrays
        int[] otroArray = {1, 3, 5, 5, 5, 5, 5, 5, 5, 5}; // Un array para comparar
        boolean sonIguales = Arrays.equals(miArray, otroArray);
        System.out.println("¿Los arrays son iguales? " + sonIguales);

        // 6. Copiar el array a otro array de mayor tamaño
        int[] copiaArray = Arrays.copyOf(miArray, 15);
        System.out.println("Copia del array (mayor tamaño): " + Arrays.toString(copiaArray));

        // 7. Imprimir el array original y la copia
        System.out.println("Array original: " + Arrays.toString(miArray));
        System.out.println("Copia del array: " + Arrays.toString(copiaArray)); */






















        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         matriz[i][j] = -1;
        //     }
        // }

        // // Imprimir la matriz
        // for (int i = 0; i < 10; i++) {
        //     for (int j = 0; j < 10; j++) {
        //         System.out.print(matriz[i][j] + "\t"); // Imprimir con tabulación
        //     }
        //     System.out.println(); // Nueva línea al final de cada fila
        // }


    }
}
