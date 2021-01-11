//Pediremos cuantos nombres deseamos almacenar.
//Iremos pidiendo uno a uno cada uno de los nombres al usuario.
//Cuando terminemos de pedir nombres, mostramos todos al usuario.
package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Class27NombresArrayLis {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        //Pediremos cuantos nombres deseamos almacenar.
        System.out.println("cuantos nombres desea almacenar");
        String datonombre = teclado.nextLine();
        //lo almaceno
        int cantidad = Integer.parseInt(datonombre);

        for (int i = 1; i < cantidad; i++) {
            //pedimos nombre
            System.out.println("introduzca nombre" + (i + 1));
            //almacenamos el dato indicado
            String nom = teclado.nextLine();
            nombres.add(nom);
        }
        System.out.println("nombre introducido");
        for (String dato : nombres) {
            System.out.println(dato);
        }
    }
}
