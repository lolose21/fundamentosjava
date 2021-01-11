package fundamentos;

import java.util.Scanner;

public class Class15Collatz {

    public static void main(String[] args) {
        //teoria : todo numero positivo
        //llegara a 1
        //si el numero es par :Dividimos entre 2
        //si el numero es impar: multiplicamos * 3 y sumamos1
        //operador del resto en java: % --> 16%2 == 0 par.
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un numero");
        //capturamos el valor que ha introducido el usuario
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        if (numero > 0) {
            while (numero != 1) {
                if (numero % 2 == 0) {
                    //par
                    numero = numero / 2;
                } else {
                    //impar
                    numero = numero * 3 + 1;
                }
                System.out.println(numero);
            }

        } else {
            System.out.println("el numero debe ser positivo");
        }
        System.out.println("fin del programa");
    }
}
