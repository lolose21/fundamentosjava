package fundamentos;

import java.util.Scanner;

public class Class24NombresArrays {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //vamos a pedir la dimension de la array
        System.out.println("¿cuantos datos desea guardar?");
        String dato = teclado.nextLine();
        int dimension = Integer.parseInt(dato);
        //creamos el array con el numero de elementos que ha
        //indicado el usuario
        String[] nombres = new String[dimension];
        for (int i = 0; i < nombres.length; i++) {
            //pedimos cada nombre
            System.out.println("introduzca el nombre " + (i + 1));
            //almacenamos el nombre indicado
            String nom = teclado.nextLine();
            //guardamos cada nombre en la posicion i del array
            nombres[i] = nom;

        }
        System.out.println("nombres introducidos corretamente");
        //mostramos todos los datos
        for (int i = 0; i < nombres.length; i++) {
            String nom = nombres[i];
            //pintamos el nombre
            System.out.println(nom);

        }
        System.out.println("fin del programa");
    }
}
