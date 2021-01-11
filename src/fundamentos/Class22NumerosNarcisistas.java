//pow -- math
package fundamentos;

import java.util.Scanner;
import javafx.util.converter.DoubleStringConverter;

public class Class22NumerosNarcisistas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //pedimo un texto numerico al usuario
        System.out.println("introduzca numeros");
        String narcisista = teclado.nextLine();
        //capturo el texto y lo trasformo en numero

        //necesitare la potencia
        //sumar la potencia
        //y la longitud
        int longitud = narcisista.length();
        int suma = 0;

        //necesitare un contador for para recorrer la longitud
        //del numero
        for (int i = 0; i < narcisista.length(); i++) {
            char caracter = narcisista.charAt(i);
            String letra = String.valueOf(caracter);
            int numero = Integer.parseInt(letra);
            double potencia = Math.pow(numero, longitud);

            suma += potencia;

        }
        if (suma == Integer.parseInt(narcisista)) {
            System.out.println("el numero es narcisista"
                    + " : " + narcisista);
        } else {
            System.out.println("el numero no es narcisista"
                    + "  : " + narcisista);
        }
    }
}
