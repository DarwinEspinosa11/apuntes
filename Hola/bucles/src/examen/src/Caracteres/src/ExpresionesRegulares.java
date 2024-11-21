import java.util.Scanner;

public class ExpresionesRegulares {
    // public static void main(String[] args) {
    //     System.out.println("Entero: " + ValidarEntero("87"));
    // }


    // public static boolean ValidarEntero(String caracter){
    //     return caracter.matches("\\+?-?[0-9]+");
    // }

/*----------------------------------------------------------------------------------------- */

    // public static void main(String[] args) {
        
    //     /*Ejercicio 6:
    //     Escribe una función en Java que valide si una cadena de texto es una dirección de correo
    //     electrónico válida. Una dirección de correo válida tiene el formato usuario@dominio.com,
    //     donde:
    //      */

    //      System.out.println("Correo electronico: " + ValidaCorreos("darwinespinosa_8@outklook.com"));

    // }

    // public static boolean ValidaCorreos(String validar){
    //     return validar.matches("[a-zA-Z0-9||[\\.-_]]+@{1}[a-zA-Z0-9]+[\\.][a-zA-z]{2,3}");
   // }


    /*------------------------------------------------------------------------------------- */
    
    // public static void main(String[] args) {
    //     /*Ejercicio 7:
    //     Crea un método que valide números de teléfono en los formatos siguientes:
    //     ● +34 123 456 789
    //     ● (123) 456-7890
    //     ● 123-456-7890
    //     ● 123.456.7890
    //      */

    //     System.out.println("validar telefono: " + ValidarTelefonoES("222-456-7890"));
        


    // }

    // public static boolean ValidarTelefonoES(String validar){
    //     return validar.matches("\\+34[0-9]{9}||^[123][0-9]{3}-{1}[0-9]{4}$||^[123]{3}-{1}[0-9]{3}-{1}[0-9]{4}||^[123]{3}(\\.[0-9]{3})(\\.[0-9]{4})");
    // }

    /*--------------------------------------------------------------------------------- */

    // public static void main(String[] args) {
    //     /*Ejercicio 8:
    //     Implementa una función que verifique si una contraseña es segura. Una contraseña segura
    //     debe:
    //     ● Tener al menos 8 caracteres.
    //     ● Contener al menos una letra mayúscula, una letra minúscula, un número y un
    //     carácter especial (@, $, !, %, *, ?, &). */
    //     contraseñaSegura("123a@@A*159875285");


    // }

    // public static void  contraseñaSegura(String contraseña){

    //     // contraseña.matches("^[A-Z]{1}&&^[a-z]{1}&&^[@$!%*?%&]{1}&&[0-9]{8}");

    //     if (contraseña.matches("[[a-z]{1,}[A-Z]{1,}[0-9]{5,}[@#%$?&*]{1,}]{8,}")) {
    //         System.out.println("La contraseña es segura");
    //     }
    //     else{
    //         System.out.println("la contraseña no es segura");
    //     }
        
        
    // }

    // public static void main(String[] args) {
    //     /*Ejercicio 9
    //     Escribe un método que valide fechas en el formato DD/MM/AAAA. La fecha debe cumplir
    //     con los siguientes requisitos:
    //     ● Día entre 01 y 31.
    //     ● Mes entre 01 y 12.
    //     ● Año de cuatro dígitos */
        
        
    //     String resultado="";
    //     Scanner teclado= new Scanner(System.in);
    //     System.out.println("Ingrese una fecha ");
    //     resultado= teclado.nextLine();
        
    //    validarFechas(resultado);
        



    // }

    // public static void validarFechas(String fecha){
        

    //     if (fecha.matches("[0-3]{2}\\/[0-9]{2}\\/[0-9]{4}")) {
    //         System.out.println("La fecha es correcta");
    //     }
    //     else{
    //         System.out.println("la fecha no es correcta");
    //     }
        

    // }


}
