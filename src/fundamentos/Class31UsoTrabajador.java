package fundamentos;

import clases.Director;
import clases.Trabajador;

public class Class31UsoTrabajador {

    public static void main(String[] args) throws Exception {
        //Trabajador tra = new Trabajador("kike ", 99);//con parametro
        Trabajador tra = new Trabajador();//sin parametros
        tra.setNombre("currante");
        tra.setApellido("Super currante");
        tra.setEdad(50);
        System.out.println("trabajador " + tra.getNombreCompleto());
        tra.setSalario(1000);
        // tra.salarioMinimo=9000;
        System.out.println(" salario " + tra.getSalario());
        System.out.println("salario minimo trabajador" + tra.getSalarioMinimo());
        Director dir = new Director();
        dir.setNombre("Director");
        dir.setApellido("Dire Dire");
        System.out.println("salario minimo Director " + dir.getSalarioMinimo());
        System.out.println("Vacaciones Trabajador ; " + tra.getVacaciones());
        System.out.println("vacaciones director ;" + dir.getVacaciones());
        System.out.println("trabajador" + tra.toString());
        System.out.println("director  " + dir.toString());
    }

}
