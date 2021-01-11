/*Guardamos en una colección Tres objetos.
Coche, Deportivo, Coche
Preguntamos al usuario, que coche quiere conducir.
    1.- Ferrari
    2.- Maserati
    3.- Hyundai
    Arrancar, acelerar, frenar
Deportivo
    Arrancar, acelerar, frenar, turbo
 */package fundamentos;

import vehiculos.Deportivo;

import java.util.ArrayList;
import java.util.Scanner;
import vehiculos.Coche;

public class Class33Abstraccion {

    public static void main(String[] args) {
        ArrayList<Coche> Coches = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        Coches.add(new Deportivo("Ferrari ", "Testarrossa"));
        Coches.add(new Coche("fiat", "Multiplica"));

        Coches.get(0).Acelerar();
        Coches.get(1).Acelerar();
        ((Deportivo) Coches.get(0)).turbo();
        // System.out.println(Coches.get(0).getClass());
        // System.out.println(Coches.get(1).getClass());
        System.out.println("¿que coche desea conducir?");
        String datoCoche = teclado.nextLine();
        int opcion = -2;
        while (opcion != -1) {

            if (datoCoche.equalsIgnoreCase("Ferrari")) {
                System.out.println("seleccione Accion"
                        + " 1 Arrancar , 2 aclerrar , 3 frenar , 4 turbo");
                String datod = teclado.nextLine();
                opcion = Integer.parseInt(datod);
            }
            if (opcion == 1) {
                ((Deportivo) Coches.get(0)).Arrancar();
                System.out.println("deportivo arrancado");
            } else if (opcion == 2) {
                System.out.println("acelerando");
                ((Deportivo) Coches.get(0)).Acelerar();
            } else if (opcion == 3) {
                ((Deportivo) Coches.get(0)).frenar();
                System.out.println("frenando");
            } else if (opcion == 4) {
                ((Deportivo) Coches.get(0)).turbo();

            }
            if (datoCoche.equalsIgnoreCase("fiat")) {
                System.out.println("seleccione Accion"
                        + " 1 Arrancar , 2 aclerrar , 3 frenar ");
                String datoc = teclado.nextLine();
                opcion = Integer.parseInt(datoc);
            }
            if (opcion == 1) {
                Coches.get(1).Arrancar();
            }
        }
    }

}
