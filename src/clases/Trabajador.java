package clases;

//public class Trabajador {
//private String nombre;
//private String apellido;
//private String edad;
public class Trabajador extends persona {

    @Override
    public String toString() {
        return this.getNombreCompleto();
    }

    //constructores
    //campos
    //getter y setter
    //metodos
    public int getVacaciones() {
        System.out.println("getVacaciones trabajador");
        return 22;
    }

    protected int salarioMinimo;

    public Trabajador() {
        //la primera linea q hace java es esta
        //aunque no la veamos
        super();
        salarioMinimo = 1500;

        System.out.println(
                "constructor trabajador");
    }

    public int getSalarioMinimo() {
        return salarioMinimo;
    }

    public Trabajador(String nombre, int edad) {
        //podemos hacer que un constructor lea
        //otro construntor de la clase super
        //indicando los parametros del constructor
        super(nombre, edad);
        System.out.println("constructor trabajo parametros");
    }

    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    // }
}
