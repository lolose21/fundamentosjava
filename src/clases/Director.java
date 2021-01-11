package clases;

public class Director extends Trabajador {

    //que metodo
    //si tengo setter tengo q esperar a q
    //direrctor direc..
    public Director() {
        System.out.println("salario minimo" + this.salarioMinimo);
        this.salarioMinimo += 200;

    }

    @Override
    public int getVacaciones() {
        System.out.println("getVacaciones director");
        //necesitamos leer el numeros de vacaciones del
        //metodo sobrescrito (trabajador)
        int numvacastrabajador = super.getVacaciones();
        return numvacastrabajador + 8;
    }

    @Override
    public String toString() {
        return "soy super dire";
    }

}
