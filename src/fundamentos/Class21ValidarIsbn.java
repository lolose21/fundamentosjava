package fundamentos;

import java.util.Scanner;

public class Class21ValidarIsbn {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca 10 numeros");
        String datonumeros = teclado.nextLine();
        if (datonumeros.length() != 10) {
            System.out.println("el numero deve ser de 10 caracteres");
        } else {
            int suma = 0;
            {
                for (int i = 0; i < datonumeros.length(); i++) {
                    char caracter = datonumeros.charAt(i);
                    //convertimos cada letra a numero
                    String letra = String.valueOf(caracter);
                    int numero = Integer.parseInt(letra);
                    //sumamos cada numero
                    int multi = numero * (i + 1);
                    suma += multi;
                }
                if (suma % 11 == 0) {

                    System.out.println("numeros incorrectos");
                } else {
                    System.out.println(" es  correcto");
                }
            }
        }
    }
}
