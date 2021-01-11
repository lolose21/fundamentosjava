package fundamentos;

import java.util.Scanner;

public class Class12Bucles {

    public static void main(String[] args) {
//        declaramos un bucle de 1 a 5
        for (int i = 1; i <= 5; i++) {
//      instrucciones
            System.out.println("contador " + i);
        }
//  se puede hacer otro incremento
// i + = numero
        for (int i = 1; i <= 20; i += 2) {
        }
// sintaxis while
//la diferencia es q la variable se declara fuera del bucle
        int numero = 1;
        while (numero <= 5) {
//        acciones
// debemos hacer algun codigo par salir del bucle
            System.out.println("while :" + numero);
            numero += 1;
        }
//    pediremos al usuario textos hasta que
//escriba la palabra stop
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        System.out.println("ESCRIBA ESTOP PARA SALIR");

        while (respuesta.equals("stop") == false) {
            System.out.println("introduzca una palabra");
            respuesta = teclado.nextLine();

        }
        System.out.println("fin del programa");

    }
}
