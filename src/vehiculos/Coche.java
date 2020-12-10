package vehiculos;

public class Coche {

    //<editor-fold defaultstate="collapsed" desc="caracteristicas">
    private String Marca;
    private String Modelo;
    protected int Velocidad;
    protected int VelocidadMaxima;
    protected boolean estadoArrancado;

    public Coche() {
        this.Velocidad = 0;
        this.VelocidadMaxima = 160;
        this.estadoArrancado = false;
    }

    public Coche(String Marca, String Modelo) {
        this.Velocidad = 0;
        this.VelocidadMaxima = 160;
        this.estadoArrancado = false;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }
    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="getter and setter">

    @Override
    public String toString() {
        return this.Marca + " " + this.Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="acciones">
    public void Arrancar() {
        if (this.estadoArrancado == true) {
            System.out.println("el coche esta en Marcha");
        } else {
            this.estadoArrancado = true;
            System.out.println("el coche ha arrancado");
        }
    }

    public void Acelerar() {
        if (this.estadoArrancado == false) {
            System.out.println("primero tienes que arrancar el coche");
        } else {
            this.Velocidad += 20;
            if (this.Velocidad >= this.VelocidadMaxima) {
                System.out.println("velocidad maxima del :"
                        + this.VelocidadMaxima);
                this.Velocidad = this.VelocidadMaxima;
            } else {
                System.out.println("acelerando .." + this.Velocidad + "km/h");
            }
        }
    }

    public void frenar() {
        this.Velocidad = this.Velocidad - 20;
        if (this.Velocidad <= 0) {
            this.Velocidad = 0;
            System.out.println("ya estas parado" + this.Velocidad);
        } else {
            System.out.println("frenado.." + this.Velocidad + " km/h");
        }
    }
//</editor-fold>

    public void frenar(int presion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 */
