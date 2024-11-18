package objetos;

public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {

    }

    public Lavadora(int carga, Double precio, String color, char consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();

        System.out.print("Ingrese la carga de la lavadora: ");
        this.carga = leer.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga>30) {
            this.precio += 500;
        }
        System.out.println("El precio de la lavadora es de $"+this.precio);
    }
}
