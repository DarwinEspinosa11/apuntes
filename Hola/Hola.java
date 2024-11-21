
import java.util.Scanner;
public class Hola {

    public static void main(String[] args) {

      //  Scanner sc= new Scanner(System.in);
        //ejercicio 11 
        //Crea un proxecto en Java que pida tres números por teclado e os amose
        //ordena-dos de maior a menor
/* 
        System.out.println("ingrese un numero");
        int num1=sc.nextInt();
        

        System.out.println("ingrese otro numero");
        int num2=sc.nextInt();

        System.out.println("ingrese ultimo numero");
        int num3=sc.nextInt();

        int grande, mediano , pequeño;

       */
      //****************************************************************************************************************** */
      // Exercicio 10: Crea un proxecto en Java que pida un número por teclado entre 0 e 99999 e
      //indi-que cantas cifras ten.



/*------------------------------------------------------------------------------------------------------------------------------------ */

      //Exercicio 7: Crea un proxecto en Java que pida un número do 1 ao 12 por teclado e que amose
        //por pantalla o nome do mes correspondente.
    /* 
      Scanner obj= new Scanner(System.in);

        System.out.println("Introduce un numero del  1 al 12");
        int num= obj.nextInt();

        switch (num) {
            case 1:
                System.out.println("enero");
                
                break;
            
            case 2:
                System.out.println("febrero");
                
                break;
            
            case 3:
                System.out.println("Marzo");
                
                break;
            
            case 4:
                System.out.println("Abril");
                
                break;
            
            case 5:
                System.out.println("Mayo");
                
                break;
            
            case 6:
                System.out.println("Junio");
                
                break;
            
            case 7:
                System.out.println("julio");
                
                break;
            
            case 8:
                System.out.println("agosto");
                
                break;
        
            case 9:
                System.out.println("septiembre");
                
                break;
            
            case 10:
                System.out.println("Octubre");
                
                break;
            
            case 11:
                System.out.println("noviembre");
                
                break;
            
            case 12:
                System.out.println("Diciembre");
                
                break;
            
            default:

            System.out.println("El numero esta fuera del rango posible");

        }

        */
        /*-------------------------------------------------------------------------------------------------- */
        /*Exercicio 8: Crea un proxecto en Java para amosar por pantalla a cualificación dunha nota a
            partir da puntuación introducida por teclado:
            – [0,5) Suspenso
            – [5,6) Aprobado
            – [6,7) Ben
            – [7,9) Notable
            – [9,10] Sobresaínte */
        
            /* 
            Scanner obj2= new Scanner(System.in);

            System.out.println("introduce una nota");
            double nota= obj2.nextDouble();
    
            if (nota < 5) {
                System.out.println("suspenso");
            }
            else if(nota >=5 & nota < 6){
                System.out.println("aprobada");
            }
            else if(nota >=6 & nota < 7){
                System.out.println("bien");
            }
            else if(nota >=7 & nota < 9){
                System.out.println("Notable");
            }
            else if(nota >=9 & nota <=10){
                System.out.println("Notable");
            }
            else {
                System.out.println("el numero esta fuera del rango permitido");
            }
            */

            // Exercicio 9: Crea un proxecto en Java que pida o día, mes e ano dunha data correcta e amose a
                //data do día seguinte. Supoñer que todos os meses teñen 30 días
              
                /*
              Scanner obj4= new Scanner(System.in);
                System.out.println("introduce dia");
                int date= obj4.nextInt();
    
                System.out.println("introduce el mes");
                int month= obj4.nextInt();
    
                System.out.println("introduce año");
                int year= obj4.nextInt();

                int sig_date= date + 1;
                int sig_month= month;
                int sig_year= year;

                if (date > 30){
                    sig_date = 1;
                    sig_month = month +1;
                    if (sig_month >12) {
                        sig_month =1;
                        sig_year=year +1;
                    }
                }

                System.out.println("el dia siguiente es: "  + sig_date +  "/" + sig_month + "/" + sig_year) ;




            //Exercicio 12: Crea un proxecto en Java que pida o día, mes e ano dunha data e indicar se a
            //dataé correcta. Supoñer que todos os meses teñen 30 días.

            Scanner obj3= new Scanner(System.in);

            System.out.println("introduce dia");
            int dia= obj3.nextInt();

            System.out.println("introduce el mes");
            int mes= obj3.nextInt();

            System.out.println("introduce año");
            int año= obj3.nextInt();

            if( dia < 0 || dia >30){
            System.out.println(" error los dias no deben pasar de 30  dias");

            }
            else if( mes < 0 || mes > 12){
                System.out.println(" error los meses no corresponde con lo minimo establecido");

            }
            else if (año <0) {
                System.out.println(" error los años estan fuera del limite establecido");
            }
            else {
                System.out.println("los dias correctos son:" + dia + "/" + mes + "/" + año);
            }


            //Exercicio 13: Crea un proxecto en Java que pida unha nota numérica, e amosar dita nota
            //daforma: cero, un, dous, tres, …

                 */

        /*///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// */


            /*Más ejercicios condicionales
            1. Escribir un programa que almacene la cadena de caracteres contraseña en
            una variable, pregunte al usuario por la contraseña e imprima por pantalla si
            la contraseña introducida por el usuario coincide con la guardada en la
            variable.
            */
            /* 
            Scanner obj3= new Scanner(System.in);

            System.out.println("introduce una contraseña");

            String contrasenna= obj3.next();
            String contra_correcta = "co";

            System.out.println(contra_correcta+" "+contrasenna);

            if (contra_correcta.equals(contrasenna) ){
                System.out.println("si son iguales");
            }else  {
                System.out.println("no son iguales ");
            }
            */
            /*2. Para tributar un determinado impuesto se debe ser mayor de 16 años y tener
            unos ingresos iguales o superiores a 1000 € mensuales. Escribir un programa
            que pregunte al usuario su edad y sus ingresos mensuales y muestre por
            pantalla si el usuario tiene que tributar o no */

            /*
            Scanner obj5= new Scanner(System.in);

            System.out.println("introduce tu edad");

            int edad= obj5.nextInt();

            System.out.println("Ingresos que tienes");

            int ingresos= obj5.nextInt();

            if (edad > 16 & ingresos >1000) {
                System.out.println("El usuario puede tributar");
            }
            else{
                System.out.println("el usuario no puede tributar");
            }
            
             */


             for (int i = 1; i<10; i++){
                System.out.println("i="+i);
                for(int j=1; j<=10 ; j++){
                    System.out.println(i + " * " + j  + " = "  + i*j);
                }
             }



             



    }

}