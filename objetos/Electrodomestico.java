package objetos;

import sun.awt.image.codec.JPEGParam;

import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in);
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Integer peso;
    private Double precio1, precio2;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Integer peso){
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumo() {
        return consumo;
    }
    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
    public Integer getPeso() {
        return peso;
    }
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char comprobarConsumo(char letra) {
        this.consumo = 'f';
        if (letra>= 'a' && letra <= 'f'){
            this.consumo = letra;
        }
        System.out.println("El consumo es "+letra);
        return letra;
    }

    public void comprobarColor(String color) {
        switch (color){
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                color=color;
                break;
            default:
                color="blanco";
                break;
        }
        System.out.println("El color es "+color);
    }

    public void crearElectrodomestico() {
        System.out.print("Ingrese una letra (de la A a la F inclusive): ");
        this.consumo = comprobarConsumo(leer.next().charAt(0));

        System.out.print("Ingrese un color(blanco, negro, rojo, azul ó gris): ");
        color = leer.next().toLowerCase();
        comprobarColor(color);

        System.out.print("Ingrese el peso del electrodoméstico: ");
        peso = leer.nextInt();

        this.precio=1000.0;
    }

    public void precioFinal() {
        switch (consumo) {
            case 'a':
                this.precio+=1000.0;
                break;
            case 'b':
                this.precio+=800.0;
                break;
            case 'c':
                this.precio+=600.0;
                break;
            case 'd':
                this.precio+=500.0;
                break;
            case 'e':
                this.precio+=300.0;
                break;
            case 'f':
                this.precio+=100.0;
                break;
        }

        if (this.peso>=1 && this.peso<=19){
            this.precio+=100.0;
        } else if (this.peso>=20 && this.peso<=49) {
            this.precio+=500.0;
        } else if (this.peso>=50 && this.peso<=79) {
            this.precio+=800.0;
        }else {
            this.precio+=1000.0;
        }
        System.out.println("Precio final: "+this.precio);
    }
}
