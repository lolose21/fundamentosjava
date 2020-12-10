package fundamentos;

import java.util.Scanner;
import vehiculos.Coche;

public class Class32Conductor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Coche Car = new Coche("Leon", "Rapido");

        int opcion = -1;
        while (opcion != 0) {
            System.out.println("0 - salir");
            System.out.println("1 - Arrancar");
            System.out.println(" 2 - Acelerar");
            System.out.println("3 - Frenar");
            System.out.println("4 - frenar con presion");
            System.out.println("5 - Ver descripcion");
            System.out.println("Seleccione una opcion");
            String dato = teclado.nextLine();
            opcion = Integer.parseInt(dato);
            if (opcion == 1) {

                Car.Arrancar();
            } else if (opcion == 2) {
                Car.Acelerar();
            } else if (opcion == 3) {
                Car.frenar();

            } else if (opcion == 4) {
                System.out.println("¿cuanto desea frenar?");
                dato = teclado.nextLine();
                int presion = Integer.parseInt(dato);
                Car.frenar(presion);
            } else if (opcion == 5) {
                System.out.println(Car.toString());
            }

        }
        System.out.println("fin del programa");

    }
}
