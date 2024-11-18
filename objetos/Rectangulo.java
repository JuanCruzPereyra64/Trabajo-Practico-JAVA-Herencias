package objetos;

public class Rectangulo implements calculosFormas{
    protected double base;
    protected double altura;

    public Rectangulo() {
    }
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Area() {
        System.out.print("Ingrese el tamaño de la base: ");
        base = leer.nextFloat();

        System.out.print("Ingrese la altura: ");
        altura = leer.nextFloat();

        double area = base*altura;
        System.out.println("El area del rectangulo es de "+area);
    }

    public void Perimetro() {
        double perimetro = (base+altura)*2;
        System.out.println("El perimetro del rectangulo es de "+perimetro);
    }
}