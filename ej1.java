
import objetos.Animal;
import objetos.Perro;
import objetos.Gato;
import objetos.caballo;
public class Ej {
    public static void main(String[] args) {
        Animal p1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        p1.Alimentarse();
        Animal p2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        p2.Alimentarse();
        Animal g1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        g1.Alimentarse();
        Animal c1 = new caballo("Spark", "Pasto", 25, "Fino");
        c1.Alimentarse();
    }
}