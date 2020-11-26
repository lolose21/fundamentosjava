
package fundamentos;

import java.util.Scanner;


public class Class06Condicionales {
//    psvm + tab
    public static void main(String[] args) {
        //creamos  scanner para pedir dato al usuario
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduzca un numero");
        String dato = teclado.nextLine();
//    evaluar si un numero es positivo 
// o negativo
        int numero = Integer.parseInt(dato) ;
        if (numero > 0 ) {
//este numero es positivo
            System.out.println("positivo");
        }else{
            System.out.println("negativo");
        }
         if (numero > 0) {
//    condicion positivo
            System.out.println("positivo");
            
        }else if (numero == 0){
//        condicion zero
            System.out.println("cero");
        }else {
//        condicion negativo
            System.out.println("negativo");
        }
    }
}

