package clases;

public class Direccion {

    public Direccion() {
        System.out.println("constructor direccion sin parametros");
        this.calle = "";
        this.ciudad = "";
        this.numero = 0;

    }

    public Direccion(String calle, String ciudad, int numero) {
        //podemos iniciar las variables con valores
        System.out.println("constructor de direccion");
        this.calle = calle;
        this.ciudad = ciudad;
        this.numero = numero;
    }
    private String calle;
    private String ciudad;
    private int numero;
//<editor-fold defaultstate="collapsed" desc="getter y better">

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

//</editor-fold>
