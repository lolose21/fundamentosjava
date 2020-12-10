package vehiculos;

public class Deportivo extends Coche {

    public Deportivo(String Marca, String Modelo) {
        super(Marca, Modelo);
        this.VelocidadMaxima = 320;
    }

    public void turbo() {
        this.Velocidad += 80;
        if (this.Velocidad >= this.VelocidadMaxima) {
            System.out.println("Velocidad maxima alcanzada"
                    + this.VelocidadMaxima + "km/h");
        }
    }

    @Override
    public void Acelerar() {
        if (this.estadoArrancado == false) {
            System.out.println("El super deportivo no a arrancado todavia");
        } else {
            this.Velocidad += 40;
            if (this.Velocidad >= this.VelocidadMaxima) {
                this.Velocidad = this.VelocidadMaxima;
                System.out.println("Velocidad maxima alcanzada"
                        + this.VelocidadMaxima + "km/h ");
            } else {
                System.out.println("acelerando" + this.Velocidad
                        + " km/h");
            }
        }
    }
}
