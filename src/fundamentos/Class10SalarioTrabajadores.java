package fundamentos;

import java.util.Scanner;

public class Class10SalarioTrabajadores {
//    declaro las variables

    int base, hextra, kmdietas, salario;
    int horas, precio, km;
//    psvm + tab

    public static void main(String[] args) {
//        indicamos que pediremos datos por el teclado o al usuario.
        Scanner teclado = new Scanner(System.in);
//        mostramos un mensaje para indicar que queremos que nos escriba
        System.out.println("numero de horas trabajadas");
//      guardamos el dato que nos pasa el usuario
        String dato = teclado.nextLine();
//        convertimos el dato de letra a numero (quitamos las comillas)
        int horas = Integer.parseInt(dato);
//    paso 2
        System.out.println("precio hora ");
        String dato2 = teclado.nextLine();
        int precio = Integer.parseInt(dato2);
//    paso 3
        System.out.println("km que ha realizado");
        String dato3 = teclado.nextLine();
        int km = Integer.parseInt(dato3);
        int base = precio * 36;
        int hextra = 0;
        int kmdietas = 0;

        if (horas > 36) {
            hextra = (horas - 36) * (precio + 2);
            System.out.println("tiene horas extra :" + hextra);
        }
        if (km < 100) {
            kmdietas = 0;
            System.out.println("no tiene bono por distancia");
        }
        if (km > 100) {
            kmdietas = 200;
        } else if (km < 250) {
            kmdietas = 200;
            System.out.println("cobra dietas regionales :" + kmdietas);
        }
        if (km > 250) {
            kmdietas = 400;

        } else if (km < 500) {
            kmdietas = 400;
            System.out.println("cobra dietas provinciales :" + kmdietas);
        }
        if (km > 500) {
            kmdietas = 600;
            System.out.println("cobra dieta internacionales" + kmdietas);

        }
        int salario = base + hextra + kmdietas;
        System.out.println("esta semana cobras :..." + salario);

    }
}
//if(num > 0 && num < 10 ){
// mensaje
//}
