import java.util.Scanner;

public class examen {
    public static void main(String[]arg){ 

        Scanner obj1= new Scanner(System.in);
        int pSobrantes=0;//almacen
        int linea=0;//conteo de última fila
        int piedras=obj1.nextInt();

        if(piedras>=1 && piedras<=250000000){
           while (piedras>0) {
            int pEntrantes=obj1.nextInt();
            if(pEntrantes<=piedras){
                pSobrantes=pSobrantes+pEntrantes;
                while(pSobrantes>linea){//si tenemos suficientes piedras hacemos una linea
                    int temporal=linea+1;//lo que necesitamos
                    pSobrantes=pSobrantes-temporal;
                    linea=linea+1;
                }
                System.out.print( "Longitud del triángulo: " + linea +"piedras. Piedras que sobran: " + pSobrantes );
                piedras=piedras-pEntrantes;
            }else System.out.println( "No me des más piedras de " + piedras );
           }
        }else System.out.println("No más de 250000000 ni menos de 0" );

        obj1.close();
    }
 }


 