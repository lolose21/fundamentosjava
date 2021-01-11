//Realizar una aplicación dónde pediremos una cantidad de números a introducir.
//Almacenaremos todos los números dentro de un Array.
//Cada número que nos dará el usuario.
//Al final, debemos mostrar cada número, la suma total y la media.
//Opción 2:
//Mientras que el usuario no ponga -1, pediremos números
//   Has introducido 10 números
//  La suma es 99
//  La media es 9.9
package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Class28NumerosArraylist {

    public static void main(String[] args) {
        // creo un ecanner para pedir datos
        Scanner teclado = new Scanner(System.in);
        //creo un array para guardar los datos
        ArrayList<Integer> numeros = new ArrayList();
        // 1-pediremos una cantidad de números a introducir.
        System.out.println("¿cuantos numeros desea introducir?");
        //capturamos el dato
        String datocantidad = teclado.nextLine();
        //traducimos el texto
        int cantidad = Integer.parseInt(datocantidad);
        //declaro sa suma i la media
        int suma = 0;
        double media = 0;
        //creo el array con los datos del usuario

        //creo un for para rrecorrelo
        for (int i = 1; i <= cantidad; i++) {
            //pedimos que introduzca los numeros
            System.out.println("introduzca numero : " + (i + 1));
            //capturamos el dato
            String datonumero = teclado.nextLine();
            //y lo traducimos
            int numero = Integer.parseInt(datonumero);
            //introducimos los numeros dentro del array
            numeros.add(numero);
            //recorremos los datos para mostrarlos con otro bucle for
        }
        System.out.println(" los numero introducidos son " + numeros);

        for (int numero : numeros) {

            //la suma
            System.out.println(numero);
        }
        media = suma / cantidad;
        System.out.println("la suma es" + suma);
        System.out.println("la media es" + media);
        System.out.println("fin del programa");
    }
}
