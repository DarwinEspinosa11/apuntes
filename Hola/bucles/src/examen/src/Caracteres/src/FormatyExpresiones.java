
import java.util.Scanner;
public class FormatyExpresiones {
    public static void main(String[] args) {
       /*Ejercicio 1:
        Crea un programa que muestre una lista de productos, sus cantidades y precios, con los
        precios formateados a dos decimales.
        Producto: Manzana - Cantidad: 3 - Precio: 0.85€
        Producto: Leche - Cantidad: 1 - Precio: 1.15€ */

        String producto;
        int cantidad;
        double precio;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un producto");
        producto=teclado.nextLine();
        
        System.out.println("Introduce la cantidad");
        cantidad=teclado.nextInt();
        System.out.println("Precio");
        precio=teclado.nextDouble();

        System.out.printf( "El producto es%s,cantidad %d y cuesta %.3f.%n",producto,cantidad,precio);

        
        
       

    }
}
