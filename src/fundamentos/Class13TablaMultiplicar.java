package fundamentos;

import java.util.Scanner;

public class Class13TablaMultiplicar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero a multiplicar");
        String datonumero = teclado.nextLine();
        int numero = Integer.parseInt(datonumero);

        //for (int i = 1; i <= 10; i++) {
        //System.out.println(numero + " x " + i + " = " + (numero * i));
        int contador = 1;
        while (contador <= 10) {
            contador += 1;
            System.out.println(numero + " x " + contador
                    + " = " + (numero * contador));
        }

    }
}
