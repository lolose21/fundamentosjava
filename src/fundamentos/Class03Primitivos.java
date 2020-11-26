package fundamentos;

import java.util.Scanner;

public class Class03Primitivos //psvm + tab
{

    public static void main(String[] args) {
        int numero = 30;
        numero = 99;
//                  los tipos char se igualan con comilla siempre
        char letra = 'A';
//      string es una Clase , no es un primitivo
// pero es un wrapper, con igualar a un valor
// ya se crea/instancia el objeto
        String texto = "hoy es lunes";
//el compilador detecta si nos hemos pasado
//en la capacidad de la variable
        byte bite = 127;
//object es la clase base de java
//todas las clases en java heredan algo
//la herencia quiere decir que un objeto no comienza
// de zero , sino que ya tiene unos metodos y propiedades
//la clase base es la clase de donde hereda un objeto directamente
//directamente
//un object puede almacenar cualquier dato
//y es un wrapper
        Object obj = "esto es un texto";
        Object obj2 = 78899;
//conversion implicita
//un double tiene mas capacidad que un int
//no nos fijamos en el valor , si no en la capacidad
//del tipo
        double mayor;
        int menor = 19;
//si almacenamos un tipo menor en mayor
//la conversion es automatica
        mayor = menor;
//conversion casting
//se realiza entre primitivos
        byte bytemenor;
        int intmayor = 99;
//queremos guardar un tipo de mayor capacidad
//la conversion  siempre al tipo de la izquierda
        bytemenor = (byte) intmayor;
//  conversion string a primitivo
//cse utilizan los metodos parse
//        por cada primitivo , tenemos una clase
//         de su tipo : double --> double
//        int --> integer , boolean -->boolean
        String dato = "78";
        int num;
//     queremos guardar el texto numero en int
        num = Integer.parseInt(dato);
        double d = Double.parseDouble(dato);
//conversion de objetos a String
        String cadena;
        int num1 = 99;
//para convertir a string los
//primitivos se utiliza el metodo
//valueof de la clase string
        cadena = String.valueOf(num1);
//     otra opcion son las conversiones
//implicitas de primitivos
//sout + tab
        System.out.println("Numero " + num1);
//para utilizar scanner
//1) toda la ruta
//java.util.Scanner;
//2)impor
//import java.util.Scanner;
        Scanner teclado = new Scanner(System.in);
// alt + enter
        System.out.println("introduzca su nombre:");
//        siempre devuelve string
        String nombre = teclado.nextLine();
        System.out.println("su nombre es:"
                + nombre);
    }
}
