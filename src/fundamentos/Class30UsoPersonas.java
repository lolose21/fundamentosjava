package fundamentos;

import clases.Direccion;
import clases.persona;

public class Class30UsoPersonas {

    public static void main(String[] args) {
        try {
            //creamos un objeto persona
            persona persona = new persona();
            //asignamos valores a sus propiedades
            persona.setNombre("ana");
            persona.setApellido("ramos");
            persona.setEdad(25);
            //queremos guardar un domicilio
            //que deseamos guardar , un objeto direccion
            //debemos crear una direccion
            //aora estamos obligados
            Direccion direccioncasa = new Direccion("calle canarias",
                    " alicante", 21);
            //direccioncasa.setCalle("calle pez");
            // direccioncasa.setCiudad("madrid");
            //direccioncasa.setNumero(14);
            persona.setDomicilio(direccioncasa);
            System.out.println("nombre :" + persona.getNombre());
            System.out.println("apellido " + persona.getApellido());
            System.out.println("edad :" + persona.getEdad());
            System.out.println(persona.getNombreCompleto());
            System.out.println(persona.getDomicilio().getCalle());
            System.out.println(persona.getDomicilio().getCiudad());
            System.out.println(persona.getDomicilio().getNumero());
        } catch (Exception ex) {
            System.out.println("tratando la excepcion con try/catch");
            System.out.println("erro:" + ex.getMessage());
        }
    }
}
