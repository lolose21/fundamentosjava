
package fundamentos;

import java.util.Scanner;


public class Class08LetraDni {
//    psvm + tab
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
//        escribimos un mensaje
        System.out.println("introduzca numero del DNI");
//capturar el dato del usuario
        String dato = teclado.nextLine();
//tipo de dato queremos 
int numero = Integer.parseInt(dato);
int calculo = numero -((numero / 23) * 23);
    if (calculo == 0){
        System.out.println("T");    
    }else if (calculo == 1){
        System.out.println("R");
    }else if(calculo == 2){
        System.out.println("W");
    }else if(calculo == 3){
        System.out.println("A");
    }else if(calculo == 4){
        System.out.println("G");
    }else if(calculo == 5){
        System.out.println("M");
    }else if(calculo == 6){
        System.out.println("Y");
    }else if(calculo == 7){
        System.out.println("F");
    }else if(calculo == 8){
        System.out.println("P");
    }else if(calculo == 9){
        System.out.println("D");
    }else if(calculo == 10){
        System.out.println("X");
    }else if(calculo == 11){
        System.out.println("B");
    }else if(calculo == 12){
        System.out.println("N");
    }else if(calculo == 13){
        System.out.println("J");
    }else if(calculo == 14){
        System.out.println("S");
        
    }else if(calculo == 15){
        System.out.println("S");
    }else if(calculo == 16){
        System.out.println("Q");
    }else if(calculo == 17){
        System.out.println("V");
    }else if(calculo == 18){
        System.out.println("H");
    }else if(calculo == 19){
        System.out.println("L");
    }else if(calculo == 20){
        System.out.println("C");
    }else if(calculo == 21){
        System.out.println("K");
    }else if(calculo == 22){
        System.out.println("E");
    }else if(calculo == 23){
        System.out.println("T");
    
  
 
        }
    }
}
