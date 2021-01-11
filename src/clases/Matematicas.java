package clases;

public class Matematicas {
//esta clase la vamos a utilizar
//no va a arrancar , sera una herramienta para
    //otras clases
    //no lleva metodo  main()

    public int sumarNumeros(int num1, int num2) {
        //acciones
        int suma = num1 + num2;
        return suma;

    }

    public int getDoble(int num) {
        return num * 2;
    }

    public double getpotencia(int num, int potencia) {
        double resultado = Math.pow(num, potencia);
        return resultado;
    }

    //el meno no devuelve nada , solamente
    //muestra opiones void
    public void menuMatematicas() {
        System.out.println("1 .- Sumar Numeros");
        System.out.println("2.- doble de numero");
        System.out.println("3. - potencia de numero");
        System.out.println("seleccione una opcion");
    }
}
