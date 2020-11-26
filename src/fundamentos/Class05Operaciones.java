//Class05Operaciones
//    Pedir dos números al usuario
//    Mostrar la suma, resta, división y multiplicación de los números.
//    La suma de 5 + 6 es 11
//    La multiplicación de 5 * 6 es 30
package fundamentos;

import java.util.Scanner;
//Scanner--> altgr + espacio

public class Class05Operaciones 
//       psvm +TAB siempre al empezar   
{
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
//   pedimos el primer numero 
// y guardamos el valor 
        System.out.println("primer numero :");
        String dato1 = teclado.nextLine();
// pedimos el segundo numero y guardamos el valor       
        System.out.println("segundo numero :");
         String dato2 = teclado.nextLine();
//convertimos el dato numero "" en resumen quitamos las comillas
//si fueran letras no es necesario convertirlo ""
        int numero1 = Integer.parseInt(dato1);
        int numero2 = Integer.parseInt(dato2);
//  realizamos las acciones      
        int por = numero1 * numero2;
//  pintamos el mensaje sout + tab
        System.out.println("si multiplicas :" + numero1 
        + " y " + numero2 + " es = " + por  );
        
        int mas = numero1 + numero2;
        System.out.println("si sumas :" + numero1 + " y " + 
                numero2 + " es = " + mas);
        
        int menos = numero1 - numero2 ;
        System.out.println("si restas :" + numero1 + " y " + 
                numero2 + " es = " + menos);
        
        float dividir = numero1 % numero2 ;
        System.out.println("si divides = :" + numero1 + " y " + 
                numero2 + " es " + dividir);
    }
    
}
