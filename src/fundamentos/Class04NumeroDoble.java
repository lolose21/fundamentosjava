/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Class04NumeroDoble {
//    metodo main
//    psvm +tab
    public static void main(String[] args) {
//        pediremos un numero al usuario
//mostraremos su doble
//clase Scanner
Scanner teclado = new Scanner(System.in);
//escribimos el mensaje de lo que necesitamos
//sout + tab
System.out.println("introduzca un numero: ");
//capturamos el dato que nos ha dado el usuario
  String dato= teclado.nextLine();
//  que tipo dedato queremos?? (numero) int
//convertimos el string dato a int
int numero = Integer.parseInt(dato);
int doble = numero * 2;
//mostramos el resultado
System.out.println("el doble de " + numero
+ " es " + doble);


    }
    
}
