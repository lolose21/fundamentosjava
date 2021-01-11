package fundamentos;

import java.util.Scanner;

public class Class17String {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = "curso apps de java";
        System.out.println("longitud: " + texto.length());
        System.out.println("touppercase(): " + texto.toUpperCase());
        System.out.println("tolowercase :" + texto.toLowerCase());
        System.out.println("indexof('a') :"
                + texto.indexOf("a"));
        System.out.println("indexof('a' , 15):"
                + texto.indexOf("a", 16));
        System.out.println("lastindexof('a')"
                + texto.lastIndexOf("a"));
        System.out.println("lastindeof('a', 16):"
                + texto.lastIndexOf("a", 16));
        System.out.println("starwith('cur'):"
                + texto.startsWith("cur"));
        System.out.println("endswith('java'):"
                + texto.endsWith("java"));
        System.out.println("substring(2,4):"
                + texto.substring(2, 4));
        System.out.println("substring(10):"
                + texto.substring(10));
        System.out.println("contains('de'):"
                + texto.contains("de"));
        //los metodos no modifican el texto
        texto.toUpperCase();//en este caso no le convierte a mayusculas
        //la unica forma de modificar el ocjeto es igual
        texto = texto.toUpperCase();//en este caso si
        System.out.println(texto);
        System.out.println("charat(9):" + texto.charAt(9));
        //startswith (???)
        //equalsignorecase(??)
        System.out.println("equals(curso de apps java):"
                + texto.equals("curso de apps java"));
        System.out.println("equals(curso de apps java):"
                + texto.equalsIgnoreCase("curso de apps java"));
        String dato = "curso";

        if (texto.toLowerCase().startsWith(dato) == true) {
            System.out.println("el texto comienza con curso");

        }
//mostramos cada carcter letra a letra
//donde comienza la cadena (posicion)?:0
//donde tertmina la cadena (indice):length()-1

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            System.out.println("posicion:" + i + "letra"
                    + letra);
        }
    }
}
