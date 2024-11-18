package objetos;

public class Televisor {
    public class Televisor extends Electrodomestico {
        protected Double resolucion;
        protected boolean TDT;

        public Televisor(){

        }

        public Televisor(Double resolucion, boolean TDT, Double precio, String color, char consumo, Integer peso) {
            super(precio, color, consumo, peso);
            this.resolucion = resolucion;
            this.TDT = TDT;
        }

        public Double getResolucion() {
            return resolucion;
        }
        public void setResolucion(Double resolucion) {
            this.resolucion = resolucion;
        }
        public boolean isTDT() {
            return TDT;
        }
        public void setTDT(boolean TDT) {
            this.TDT = TDT;
        }

        public void crearTelevision() {
            super.crearElectrodomestico();

            System.out.print("Ingrese la resolución: ");
            this.resolucion = leer.nextDouble();
            System.out.print("¿Tiene sintetizador TDT (si/no)? ");
            String opcion = leer.next();
            this.TDT=false;
            if (opcion.equalsIgnoreCase("si")) {
                this.TDT = true;
            }
        }

        @Override
        public void precioFinal() {
            super.precioFinal();
            if (this.resolucion > 40){
                this.precio += this.precio*0.3;
            }

            if (this.TDT == true){
                this.precio += 500;
            }
            System.out.println("El precio del Televisor es de $"+this.precio);
        }
    }
}
