package objetos;

public class Circulo implements calculosFormas {
    protected double radio;
    protected double diametro;

    public Circulo() {
    }
    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getDiametro() {
        return diametro;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public void Area() {

        System.out.print("Ingrese el Radio: ");
        radio = leer.nextDouble();

        double area = PI*((float) Math.pow(radio,2));

        System.out.println("El area del circulo es de "+area);
    }

    public void Perimetro() {

        diametro = radio*2;

        double perimetro = PI*diametro;

        System.out.println("El perimetro del circulo es de "+perimetro);
    }
}