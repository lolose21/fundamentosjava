 //Pedir un número al usuario (1-4).
// 1 - OTOÑO
// 2 - INVIERNO
// 3 - PRIMAVERA
//4 - VERANO
//  Otro valor: OPCION INCORRECTA
package fundamentos;

import java.util.Scanner;

public class Class07Estaciones {
//    psvm + tab

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//   mostraremos el mensaje 
// sout + tab
        System.out.println("introduzca un numero : ");
// guardamos el valor
        String dato = teclado.nextLine();
// convertimos el String dato a int
        int numero = Integer.parseInt(dato);
        if (numero == 1) {
            System.out.println("OTOÑO");
        } else if (numero == 2) {
            System.out.println("INVIERNO");
        } else if (numero == 3) {
            System.out.println("verano");
        } else {
            System.out.println("numero incorrecto");
        }
    }
}
