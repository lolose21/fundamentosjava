package fundamentos;

public class Class23Array {

    public static void main(String[] args) {
        //creamos un array de nombres
        //almacenamos datos dentro
        String[] nombres = new String[3];
        nombres[0] = "lucia";
        nombres[1] = "diana";
        nombres[2] = "adrian";
        //antes de guardar , vamos a recorre el array
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            System.out.println(nombre);
        }
        //tambiem podemos iniciar y crear los elementos del
        //array a la vez
        int[] numeros = new int[]{99, 88, 44, 55, 2, 3, 8};
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            System.out.println("numero :" + num);
        }
    }
}
