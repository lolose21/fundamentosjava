package fundamentos;

import java.util.Scanner;

public class Class11MayorTresnumeros {

    int primero, segundo, tercero;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("primer numero");
        String datoprimero = teclado.nextLine();
//        convertimos el numero de letra a numero
        int primero = Integer.parseInt(datoprimero);
//        pedimos el segundo numero
        System.out.println("segundo numero");
//          validamos el dato insertado
        String datosegundo = teclado.nextLine();
//          convertimos el numero de letra a numero
        int segundo = Integer.parseInt(datosegundo);
//          pediremos el tercer numero mediante un mensaje
        System.out.println("tercer numero");
//        validamos el dato insertado
        String datotercero = teclado.nextLine();
//        convertimos el String a numero
        int tercero = Integer.parseInt(datotercero);

//        declaro
//        tenemos que averiguar que numero es mayor
        if (primero > segundo) {
            if (primero > tercero) {

                System.out.println("el numero mayor es  , " + primero);

                System.out.println("el numero menor es " + tercero);
                System.out.println("el numero mediano es " + segundo);
            } else if (segundo == tercero) {
                System.out.println("el numero mayor es ," + primero);
                System.out.println("los numeros son iguales" + segundo
                        + "  , " + tercero);

            } else {
                System.out.println("el numero mayor es " + primero
                        + "el numero menor es " + segundo
                        + "por descarte el mediano es " + tercero);
            }
            if (primero == tercero) {
                System.out.println("los numero son iguales" + primero
                        + "  , " + tercero);
                System.out.println("el numero menor es " + segundo);
            } else {
                System.out.println("el mayor es " + tercero
                        + "el menor es " + segundo
                        + "el mediano es " + primero);
            }
            if (segundo > tercero) {
            } else if (primero == tercero) {
                System.out.println("el numero mayor es" + segundo);
                System.out.println("los numeros son iguales" + primero
                        + " , " + tercero);

            } else if (segundo == primero) {
                System.out.println(" las numeros son iguales " + segundo
                        + " , " + primero);
                System.out.println("el numero menor " + tercero);

            } else if (primero > tercero) {
                System.out.println("el numero mayor es " + segundo);
                System.out.println(" el numero menor es " + tercero);
                System.out.println("el numero medio es " + primero);
            } else {
                System.out.println("el numero mayor es " + segundo
                        + " el menor es " + primero
                        + "el numero medio es" + tercero);
            }
            if (primero == segundo) {
            } else if (segundo == tercero) {
                System.out.println("los numeros son iguales " + primero
                        + "  , " + segundo + " , " + tercero);
            } else {
                System.out.println("el numero mayor es " + tercero
                        + "los numeros son iguales " + primero
                        + " , " + segundo);
            }
            if (segundo == tercero) {
                System.out.println("los numeros mayores son iguales " + segundo
                        + "  , " + tercero);
                System.out.println("el numero menor es " + primero);
            } else {
                System.out.println("el numero mayor es " + tercero
                        + " el numero menor es " + primero
                        + "el numero mediano es " + segundo);
            }
        }
    }
}
