package clases;

public class persona {
    //<editor-fold defaultstate="collapsed" desc="constructor de persona">

    public persona() {
        System.out.println("constructor persona");
    }

    public persona(String nombre, int edad) {
        System.out.println("constructor con parametros personas");
    }
//</editor-fold>
    //los campos de propiedad son privados
// <editor-fold defaultstate="collapsed" desc="Descripción">
    private String nombre;//getter y setter
    private String apellido;//boton derecho-> inser code->
    private int edad;
    private Direccion domicilio;
// </editor-fold>// <editor-fold defaultstate="collapsed" desc="Descripción">

// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="getter y better">
    public Direccion getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Direccion domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            //varias opciones
            //error silencioso; cambiamos el valor
            //a otro
            //2. lanzar una excepcion
            throw new Exception("la edad no puede ser negativa");
            //this.edad = 0;
        } else {
            this.edad = edad;
        }
// </editor-fold>
    }
    //getter

// <editor-fold defaultstate="collapsed" desc="sobrecarga de metodos">
    public String getNombreCompleto() {
        return this.nombre + "  " + this.apellido;
    }

    public String getNombreCompletoInversa() {
        return this.apellido + "  " + this.nombre;
    }

    public String getNombreCompletoMayusculas() {
        return this.nombre.toUpperCase() + " " + this.apellido.toUpperCase();
    }

// </editor-fold>
}
//<editor-fold defaultstate="collapsed" desc="">

//</editor-fold>
