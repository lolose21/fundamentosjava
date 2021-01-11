//  Pedir cuantos números quiere almacenar el usuario.
//    Almacenamos cada número que el usuario ha dicho hasta llegar a la dimensión.
//    Mostrar todos los números, la suma y la media.
package fundamentos;

import java.util.Scanner;

public class Class25NumarosArray {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //pido la cantidad de numeros a introducir
        System.out.println("¿cunantos numeros desea guardar?");
        //capturo el texto
        String dato = teclado.nextLine();
        //convierto el texto a numero
        int tamaño = Integer.parseInt(dato);
        int suma = 0;

        //creo el array con los datos del usuario
        int[] numeros = new int[tamaño];
        //creo un for para recorrer el for
        for (int i = 0; i < numeros.length; i++) {
            //pedimos numero a numero
            System.out.println("introducca numero " + (i + 1));
            //almaceno el numero introducido
            String numero = teclado.nextLine();
            //guardo el numero y la posicion array
            int num = Integer.parseInt(numero);
            numeros[i] = num;
        }

        System.out.println("numeros introducidos");
        //muestro todos los numeros
        //con un for
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            suma += num;
            //pintamos los numeros
            System.out.println(num);
        }
        System.out.println("suma de los numeros :" + suma);
        double media = suma / numeros.length;
        System.out.println("media de los numeros " + media);
    }
}
