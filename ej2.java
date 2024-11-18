import objetos.Electrodomestico;
import objetos.Lavadora;
import objetos.Televisor;

import java.util.ArrayList;

public class ej2 {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electro = new ArrayList();
        Lavadora l1 = new Lavadora();
        Lavadora l2 = new Lavadora();
        Televisor t1 = new Televisor();
        Televisor t2 = new Televisor();

        l1.crearLavadora();

        t1.crearTelevision();

        l2.crearLavadora();

        t2.crearTelevision();

        electro.add(l1);
        electro.add(l2);
        electro.add(t1);
        electro.add(t2);

        for (Electrodomestico aux: electro) {

        }
    }
