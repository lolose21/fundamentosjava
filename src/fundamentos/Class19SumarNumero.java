package fundamentos;

import java.util.Scanner;

public class Class19SumarNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un dato numerico");
        String datonumero = teclado.nextLine();
        //tenemos que recorrer todo el texto
        //y sumar todos sus numeros
        int suma = 0;
        for (int i = 0; i < datonumero.length(); i++) {
            char letra = datonumero.charAt(i);
            //convertimos cada letra a numero
            String caracter = String.valueOf(letra);
            int numero = Integer.parseInt(caracter);
            //sumamos cada numero
            suma += numero;

        }
        System.out.println("la suma de " + datonumero + " es "
                + suma);
    }
}
