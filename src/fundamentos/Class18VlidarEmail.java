  //Pediremos un email al usuario
//Debemos comprobar las siguientes características:
//1) Email contenga @
//2) Email no comienza ni finaliza con @
//3) Email solo tiene una @
//4) Email contiene un punto
//5) Existe un punto después de @
// 6) Dominio debe ser de 2 a 4 caracteres
package fundamentos;

import java.util.Scanner;

public class Class18VlidarEmail {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un email");
        String dato = teclado.nextLine();
        String texto = dato;
        //1 comprobar que el correo contenga @
        if (texto.contains("@") == false) {
            System.out.println("el email no contiene @");
        } //2 Email no comienza ni finaliza con @
        else if (texto.startsWith("@") == true) {
            System.out.println("el texto no puede empezar com @");
        } else if (texto.endsWith("@") == true) {
            System.out.println("el texto no puede finalizar en @");
            //3 comprobar que el email solo contiene una @
            //Combinar indexOf con lastIndexOf
        } else if (texto.indexOf("@") != texto.lastIndexOf("@")) {
            System.out.println("el email contiene mas de una @ ");
            //4 comprobar que el email contiene un punto
        } else if (texto.contains(".") == false) {
            System.out.println("el email no contiene  puntos");
            //5 existe un punto detras del @
        } else if (texto.lastIndexOf(".") < texto.indexOf("@")) {
            System.out.println("no existe punto detras del @");
            // Dominio debe ser de 2 a 4 caracteres , length +
        } else if (texto.endsWith(".es") != texto.endsWith(".com")
                == false) {
            System.out.println("el email no tiene el dominio adecuado");
        } else {
            System.out.println("el email es correcto");
        }
        System.out.println("fin del programa");
    }
}
