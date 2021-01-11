package fundamentos;

import java.util.Scanner;

public class Class14AccionesNumeros {

    int numero1, numero2, total;
    int mnumero1, mnumero2, mtotal;

    public static void main(String[] args) {
        // Pediremos números al usuario hasta que nos indique el número -1.
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un numero");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        System.out.println("introduzca accion : sumar o multiplicar  (s|m)");
        String accion = teclado.nextLine();
        int valor = 0;
        while (numero != -1) {
            System.out.println("ha introducido el numero:" + numero);
            if (accion.equalsIgnoreCase("s") == true) {
                valor += numero;
                System.out.println("la suma es " + valor);

            } else if (accion.equalsIgnoreCase("m") == true) {
                valor = valor * numero;
                System.out.println("la multiplicacion es " + valor);
            }
            System.out.println("intoduzca un numero");
            dato = teclado.nextLine();
            numero = Integer.parseInt(dato);
            System.out.println("introduzca accion sumar (s) o multiplicar (m)");
            accion = teclado.nextLine();
        }
        System.out.println("fin del programa");
    }
}
