package fundamentos;

import clases.Matematicas;
import java.util.Scanner;

public class Class29UsoMatematicas {
//que deseamoos hcer aqui
    //probar la suma de numeros
    //como deseamos ejecutar ,necesitamos un maing()

    public static void main(String[] args) {
        //touppercase(): objeto string
        //sumarnumeros(); objeto matematicas
        Matematicas mates = new Matematicas();
        Scanner teclado = new Scanner(System.in);
        //desde aqui ,tenemos muchas posibilidades
        //posemos sumar
        //mates.sumarNumeros()????
        mates.menuMatematicas();
        String dato = teclado.nextLine();
        int opcion = Integer.parseInt(dato);
        if (opcion == 1) {
            int suma = mates.sumarNumeros(4, 10);
            System.out.println("suma :" + suma);
        } else if (opcion == 2) {
            int doble = mates.getDoble(88);
            System.out.println("doble :" + doble);
        } else if (opcion == 3) {
            double potencia = mates.getpotencia(4, 3);
            System.out.println("potencia;" + potencia);
        }

    }

}
