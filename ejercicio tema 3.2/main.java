class Coche {
    int numPuertas;

    public void incrementarPuertas() {
        numPuertas++;
    }
}

public class main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        miCoche.incrementarPuertas();
        System.out.println("Mi coche tiene " + miCoche.numPuertas + " puerta(s).");
    }
}